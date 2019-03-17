package com.springboot.oneforall.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class IO_Socket_Service {
    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket(8090);
        System.out.println("服务端启动");
        Socket socket = null;
        socket = serverSocket.accept();
        String line;
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        System.out.println("Client:"+in.readLine());
        in.close();
        socket.close();
        serverSocket.close();
    }
}
