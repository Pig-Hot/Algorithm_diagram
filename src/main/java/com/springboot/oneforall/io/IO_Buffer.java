package com.springboot.oneforall.io;

import java.io.*;

public class IO_Buffer {
    public static void main(String[] args) throws IOException {
        File file = new File("stream.txt");
        if(!file.exists()){
            file.createNewFile();
        }else {
            file.delete();
            file.createNewFile();
        }
        Writer writer = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(writer);
        bw.write("abc");
        bw.close();
        writer.close();
        Reader reader = new FileReader(file);
        BufferedReader br = new BufferedReader(reader);
        String str = null;
        while ((str = br.readLine()) != null){
            System.out.println(str);
        }
        reader.close();
        br.close();
    }
}
