package com.microservice.exec.handler;

import com.microservice.exec.constant.WebSocketConstant;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.channel.group.ChannelGroup;
import io.netty.handler.codec.http.FullHttpRequest;
import io.netty.handler.codec.http.HttpHeaderNames;
import io.netty.handler.codec.http.HttpHeaders;
import io.netty.handler.codec.http.HttpMethod;
import io.netty.handler.codec.http.websocketx.*;
import io.netty.util.AttributeKey;

/**
 * author  zhaoqi
 * date  2020/11/10 14:17
 */
public class WebSocketHandler extends SimpleChannelInboundHandler<Object> {

    private static final AttributeKey<WebSocketServerHandshaker> ATTR_HANDSHAKER = AttributeKey.newInstance("ATTR_KEY_CHANNELID");

    private String WEBSOCKET_URI_ROOT = String.format(WebSocketConstant.WEBSOCKET_URI_ROOT_PATTERN, "localhost", 6005);

    private ChannelGroup group;

    public WebSocketHandler(ChannelGroup group){
        this.group = group;
    }

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, Object msg) throws Exception {
        System.out.println(msg);
        if (msg instanceof FullHttpRequest) {
            FullHttpRequest request = (FullHttpRequest) msg;
            if(isWebSocketUpgrade(request)){
                String subProtocols = request.headers().get(HttpHeaderNames.SEC_WEBSOCKET_PROTOCOL);
                WebSocketServerHandshakerFactory factory = new WebSocketServerHandshakerFactory(WEBSOCKET_URI_ROOT, subProtocols, false);
                WebSocketServerHandshaker handshaker = factory.newHandshaker(request);

                if(handshaker == null){
                    WebSocketServerHandshakerFactory.sendUnsupportedVersionResponse(ctx.channel());
                }else{
                    //响应请求
                    handshaker.handshake(ctx.channel(), request);
                    //将handshaker绑定给channel
                    ctx.channel().attr(ATTR_HANDSHAKER).set(handshaker);
                }
            }
        }
        if (msg instanceof WebSocketFrame) {
            WebSocketFrame frame = (WebSocketFrame) msg;
            if(frame instanceof TextWebSocketFrame){
                String text = ((TextWebSocketFrame) frame).text();
                TextWebSocketFrame rsp = new TextWebSocketFrame(text);
                group.writeAndFlush(rsp);
            }

            //ping 回复 pong
            if(frame instanceof PingWebSocketFrame){
                ctx.channel().writeAndFlush(new PongWebSocketFrame(frame.content().retain()));
                return;
            }

            if(frame instanceof PongWebSocketFrame){
                return;
            }

            if(frame instanceof CloseWebSocketFrame){
                WebSocketServerHandshaker handshaker = ctx.channel().attr(ATTR_HANDSHAKER).get();
                if(handshaker == null){
                    return;
                }
                handshaker.close(ctx.channel(), (CloseWebSocketFrame)frame.retain());
            }
        }
    }

    @Override
    public void channelReadComplete(ChannelHandlerContext ctx) throws Exception {
        ctx.flush();
    }

    //1、判断是否为get 2、判断Upgrade头 包含websocket字符串 3、Connection头 包换upgrade字符串
    private boolean isWebSocketUpgrade(FullHttpRequest request){
        HttpHeaders headers = request.headers();
        return request.method().equals(HttpMethod.GET)
                && headers.get(HttpHeaderNames.UPGRADE).contains(WebSocketConstant.WEBSOCKET_UPGRADE)
                && headers.get(HttpHeaderNames.CONNECTION).contains(WebSocketConstant.WEBSOCKET_CONNECTION);
    }
}
