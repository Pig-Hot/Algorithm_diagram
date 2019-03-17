package com.springboot.oneforall.io;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IO_Character {
    public static void main(String[] args) throws IOException {
        File file = new File("stream.txt");
        if(!file.exists()){
            file.createNewFile();
        }else {
            file.delete();
            file.createNewFile();
        }
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write("abc");
        fileWriter.close();
        FileReader fileReader = new FileReader(file);
        char c0[] = new char[1024];
        int i = fileReader.read(c0);
        fileReader.close();
        System.out.println(new String(c0,0,i));
    }
}
