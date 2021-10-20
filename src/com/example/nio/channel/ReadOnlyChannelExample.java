package com.example.nio.channel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.FileChannel;

import com.example.nio.buffer.CharBufferExample;

public class ReadOnlyChannelExample {

	public static void main(String[] args) throws FileNotFoundException {
		RandomAccessFile raf = new RandomAccessFile ("G:/temp/data/somefile.txt", "r");
		FileChannel fc = raf.getChannel();
		ByteBuffer charBuffer = ByteBuffer.allocate(10);
		// This will compile but will throw an IOException 
				// because the underlying file is read-only
		
		try {
			fc.write(charBuffer);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		FileInputStream input = new FileInputStream ("readOnlyFile.txt");
		FileChannel channel = input.getChannel();
		 
		
		//channel.write (buffer);
		
	}
}
