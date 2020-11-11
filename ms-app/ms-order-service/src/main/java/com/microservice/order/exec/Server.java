package com.microservice.order.exec;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.channels.Selector;

/**
 * author  zhaoqi
 * date  2020/11/4 10:59
 */
public class Server {
    public static void main(String[] args)throws Exception {
        ServerSocket serverSocket = new ServerSocket(9000);
        for (;;){
            Socket socket = serverSocket.accept();
            System.out.println("adsfadffadsf");

            new Thread(new Runnable() {
                @Override
                public void run()  {
                    byte[] bytes = new byte[1024];
                    try {
                        socket.getInputStream().read(bytes);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    System.out.println(new String(bytes));
                }
            }).start();

        }
    }
}
