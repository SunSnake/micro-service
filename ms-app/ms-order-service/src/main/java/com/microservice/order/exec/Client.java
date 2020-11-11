package com.microservice.order.exec;

import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * author  zhaoqi
 * date  2020/11/4 11:17
 */
public class Client {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("localhost", 6000);


        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        OutputStream out = socket.getOutputStream();
        out.write(input.getBytes());
        out.flush();
        socket.close();
        /*EventLoopGroup bossGroup = new NioEventLoopGroup(1);
        EventLoopGroup workGroup = new NioEventLoopGroup();*/
    }
}
