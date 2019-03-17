package com.springboot.oneforall.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class IO_Socket_Client {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("127.0.0.1",8090);
        System.out.println("客户端启动");
        String line = "Socket通信";
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        bufferedWriter.write(line);
        bufferedWriter.close();
        socket.close();
    }
}
