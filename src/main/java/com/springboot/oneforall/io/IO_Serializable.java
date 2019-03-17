package com.springboot.oneforall.io;

import java.io.*;

class Person implements Serializable{
    private static final long serialVersionUID = 7827863437931135333L;

    private transient String name;
    private int age;
    private final static String sex = "man";

    public Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public String toString()
    {
        return "姓名：" + this.name + "， 年龄：" + this.age + ", 性别：" + sex;
    }
}
public class IO_Serializable {
    // 序列化对象方法
    public static void serializable(File file) throws Exception
    {
        OutputStream outputFile = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(outputFile);
        oos.writeObject(new Person("张三", 25));
        oos.close();
    }

    // 反序列化对象方法
    public static void deserializable(File file) throws Exception
    {
        InputStream inputFile = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(inputFile);
        Person p = (Person)ois.readObject();
        System.out.println(p);
    }

    public static void main(String[] args) throws Exception {
        File file = new File("stream.txt");
        serializable(file);
        deserializable(file);
    }
}
