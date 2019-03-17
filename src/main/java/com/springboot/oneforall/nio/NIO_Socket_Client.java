package com.springboot.oneforall.nio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;

public class NIO_Socket_Client {
    public static void main(String[] args) throws Exception {
        SocketChannel socketChannel = SocketChannel.open();
        socketChannel.configureBlocking(false);
        socketChannel.connect(new InetSocketAddress("127.0.0.1",8090));
        while (!socketChannel.finishConnect()){
            System.out.println("正在连接......");
            Thread.sleep(1000);
        }
        ByteBuffer byteBuffer = ByteBuffer.allocate(100);
        byteBuffer.put("Hello world!".getBytes());
        byteBuffer.flip();
        socketChannel.write(byteBuffer);
        byteBuffer.clear();
        socketChannel.close();
    }
}
