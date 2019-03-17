package com.springboot.oneforall.io;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class IO_File {

    private static List<String> list = new ArrayList<>();
    public static void main(String[] args) {
        String fileName = "D:\\BaiduNetdisk\\AutoUpdate";
        File file = new File(fileName);
        checkEndWithDLL(findFile(file)).forEach(System.out::println);
    }
    private static List<String> findFile(File file){
        if(file.isDirectory()) {
            File[] files = file.listFiles();
            if (files != null) {
                for (File f : files) {
                    findFile(f);
                }
            }
        }
        else {
            list.add(file.getName());
        }
        return list;
    }

    private static List<String> checkEndWithDLL(List<String> list){
        return list.stream().filter(x -> x.endsWith(".dll")).collect(Collectors.toList());
    }
}
