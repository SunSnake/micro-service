package com.microservice.order.http;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.*;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.net.InetSocketAddress;

/**
 * author  zhaoqi
 * date  2020/11/5 14:32
 */
@Slf4j
public class NettyServer {
    public void start(InetSocketAddress address){
        EventLoopGroup bossGroup = new NioEventLoopGroup(1);
        EventLoopGroup workGroup = new NioEventLoopGroup();

        try {
            ServerBootstrap bootstrap = new ServerBootstrap();
            bootstrap.group(bossGroup, workGroup)
                    .channel(NioServerSocketChannel.class)
                    .localAddress(address)
                    .childHandler(new ServerChannelInitializer())
                    .option(ChannelOption.SO_BACKLOG, 128)
                    .childOption(ChannelOption.SO_KEEPALIVE, true);

            log.info("Server start listen at " + address.getPort());

            ChannelFuture future = bootstrap.bind(address).sync();
            future.channel().closeFuture().sync();

        } catch (Exception e){
            e.printStackTrace();
            bossGroup.shutdownGracefully();
            workGroup.shutdownGracefully();
        }

    }

    public static void main(String[] args) {
        InetSocketAddress address = new InetSocketAddress("localhost", 6666);
        NettyServer server = new NettyServer();
        server.start(address);

    }
}
