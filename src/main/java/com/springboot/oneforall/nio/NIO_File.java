package com.springboot.oneforall.nio;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class NIO_File {
    public static void main(String[] args) throws IOException {
        File file = new File("stream.txt");
        FileOutputStream fos = new FileOutputStream(file);
        FileInputStream fis = new FileInputStream(file);
        FileChannel fc = fis.getChannel();
        FileChannel fileChannel = fos.getChannel();
        ByteBuffer bb = ByteBuffer.allocate(35);
        ByteBuffer byteBuffer = ByteBuffer.allocate(35);
        String str = "abc";
        byteBuffer.put(str.getBytes());
        byteBuffer.flip();
        fileChannel.write(byteBuffer);
        bb.clear();
        fileChannel.close();
        fc.read(bb);
        bb.flip();
        while (bb.hasRemaining())
        {
            System.out.print((char)bb.get());
        }
        bb.clear();
        fc.close();
    }
}
