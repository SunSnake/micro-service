package com.microservice.exec.service;

import com.microservice.exec.constant.HttpConstant;
import com.microservice.exec.handler.WebSocketHandler;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.*;
import io.netty.channel.group.ChannelGroup;
import io.netty.channel.group.DefaultChannelGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.handler.codec.http.HttpObjectAggregator;
import io.netty.handler.codec.http.HttpServerCodec;
import io.netty.handler.stream.ChunkedWriteHandler;
import io.netty.util.concurrent.GlobalEventExecutor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * author  zhaoqi
 * date  2020/11/10 14:42
 */
@Service
@Slf4j
public class WebSocketService {

    private static final int MAX_CONTENT_LENGTH = 65536;

    //存放websocket连接
    private ChannelGroup group = new DefaultChannelGroup(GlobalEventExecutor.INSTANCE);

    private static class SingletonWebSocket{
        static final WebSocketService instance = new WebSocketService();
    }

    public static WebSocketService getInstance(){
        return SingletonWebSocket.instance;
    }

    private WebSocketService() {}

    public void start(int port) {
        EventLoopGroup bossGroup = new NioEventLoopGroup(1);
        EventLoopGroup workGroup = new NioEventLoopGroup();

        try {
            ServerBootstrap serverBootstrap = new ServerBootstrap();
            serverBootstrap.group(bossGroup, workGroup)
                    .channel(NioServerSocketChannel.class)
                    .childHandler(new WebSocketInitializer())
                    .option(ChannelOption.SO_BACKLOG, 128)
                    .childOption(ChannelOption.SO_KEEPALIVE, true);

            ChannelFuture channelFuture = serverBootstrap.bind(port).addListener(new ChannelFutureListener() {
                @Override
                public void operationComplete(ChannelFuture future) throws Exception {
                    if(future.isSuccess()){
                        log.info("Netty Websocket Server Starting ....  on port:{}", port);
                    }
                }
            }).sync();
            channelFuture.channel().closeFuture().addListener(new ChannelFutureListener() {
                @Override
                public void operationComplete(ChannelFuture future) throws Exception {
                    log.info("Netty Websocket channel is closed");
                }
            }).sync();
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            workGroup.shutdownGracefully();
            bossGroup.shutdownGracefully();
        }
    }

    private class WebSocketInitializer extends ChannelInitializer<Channel> {
        @Override
        protected void initChannel(Channel channel) throws Exception {
            ChannelPipeline channelPipeline = channel.pipeline();
            group.add(channel);

            channel.closeFuture().addListener(new ChannelFutureListener() {
                @Override
                public void operationComplete(ChannelFuture future) throws Exception {
                    //关闭后抛弃
                    group.remove(channel);
                }
            });

            channelPipeline.addLast(HttpConstant.HN_HTTP_CODEC, new HttpServerCodec());
            channelPipeline.addLast(HttpConstant.NH_HTTP_AGGREGATOR, new HttpObjectAggregator(MAX_CONTENT_LENGTH));
            channelPipeline.addLast(HttpConstant.NH_HTTP_CHUNK, new ChunkedWriteHandler());
            channelPipeline.addLast(HttpConstant.NH_SERVER, new WebSocketHandler(group));
        }
    }
}
