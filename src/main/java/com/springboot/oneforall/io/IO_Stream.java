package com.springboot.oneforall.io;

import java.io.*;

public class IO_Stream {
    public static void main(String[] args) throws IOException {
        File file = new File("stream.txt");
        if(!file.exists()){
            file.createNewFile();
        }else {
            file.delete();
            file.createNewFile();
        }
        OutputStream outputStream = new FileOutputStream(file);
        byte[] write = "abc".getBytes("utf-8");
        outputStream.write(write);
        outputStream.close();
        InputStream inputStream = new FileInputStream(file);
        int i = 0;
        byte[] bytes = new byte[(int)file.length()];
        i = inputStream.read(bytes);
        System.out.println(i);
        System.out.println(new String(bytes, 0, i));
    }
}
