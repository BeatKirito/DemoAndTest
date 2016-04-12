package com.beat.nio;

import java.io.*;
import java.net.ServerSocket;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Collections;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by beatkirito on 2016/3/20.
 */
public class BufferTest {

    public static final int BSIZE = 1024;

    public static void main(String[] args) throws Exception {

        FileChannel fc = new FileOutputStream("data.txt").getChannel();
        fc.write(ByteBuffer.wrap("Some Text".getBytes()));
        fc.close();

        fc = new RandomAccessFile("data.txt","rw").getChannel();
        fc.position(fc.size());
        fc.write(ByteBuffer.wrap("Some more".getBytes()));
        fc.close();

        fc = new FileInputStream("data.txt").getChannel();
        ByteBuffer buff = ByteBuffer.allocate(BSIZE);
        fc.read(buff);
        buff.flip();

        while(buff.hasRemaining())
            System.out.print((char)buff.get());


        buff.asCharBuffer();

    }
}
