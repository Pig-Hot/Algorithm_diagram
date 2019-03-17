package com.springboot.oneforall.nio;

import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.nio.ByteBuffer;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;

public class NIO_Socket_Service {
    public static void main(String[] args) throws Exception {
        ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
        serverSocketChannel.configureBlocking(false);
        ServerSocket serverSocket = serverSocketChannel.socket();
        serverSocket.bind(new InetSocketAddress(8090));
        while (true){
            SocketChannel socketChannel = serverSocketChannel.accept();
            if(socketChannel == null){
                Thread.sleep(1000);
            }else {
                StringBuffer stringBuffer = new StringBuffer();
                ByteBuffer byteBuffer = ByteBuffer.allocate(100);
                socketChannel.read(byteBuffer);
                byteBuffer.flip();
                while (byteBuffer.hasRemaining()){
                    stringBuffer.append(byteBuffer.get());
                }
                socketChannel.close();
                System.out.println("客户端传来数据: " + stringBuffer.toString());
            }
        }
    }
}
