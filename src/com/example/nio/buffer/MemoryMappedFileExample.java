package com.example.nio.buffer;

import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

public class MemoryMappedFileExample 
{
    static int length = 0x8FFFFFF;  
 
    public static void main(String[] args) throws Exception 
    {
        try(RandomAccessFile file = new RandomAccessFile("howtodoinjava.dat", "rw")) 
        {
            MappedByteBuffer out = file.getChannel()
                                        .map(FileChannel.MapMode.READ_WRITE, 0, length);
             
            for (int i = 0; i < length; i++) 
            {
                out.put((byte) 'x');
            }
             
            System.out.println("Finished writing");
        }
    }
}