package com.springboot.oneforall.io;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

class Sender implements Runnable{

    private PipedOutputStream out = new PipedOutputStream();

    public PipedOutputStream getOutputStream()
    {
        return out;
    }

    @Override
    public void run()
    {
        String str = "Receiver, 你好!";
        try
        {
            out.write(str.getBytes()); // 向管道流中写入数据（发送）
            out.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}

class Receiver implements Runnable{
    private PipedInputStream in = new PipedInputStream();

    public PipedInputStream getInputStream()
    {
        return in;
    }
    @Override
    public void run() {
        String s = null;
        byte b0[] = new byte[1024];
        try
        {
            int length = in.read(b0);
            if (-1 != length)
            {
                s = new String(b0, 0 , length);
                System.out.println("收到了以下信息：" + s);
            }
            in.close();
        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}


public class IO_Pipe {
    public static void main(String[] args) throws IOException {
        Sender sender = new Sender();
        Receiver receiver = new Receiver();
        Thread senderThread = new Thread(sender);
        Thread receiverThread = new Thread(receiver);
        PipedOutputStream out = sender.getOutputStream(); // 写入
        PipedInputStream in = receiver.getInputStream(); // 读出
        out.connect(in);// 将输出发送到输入
        senderThread.start();
        receiverThread.start();
    }
}
