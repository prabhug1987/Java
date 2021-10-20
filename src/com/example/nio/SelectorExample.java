package com.example.nio;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.Selector;

public class SelectorExample {
	
	public static void main(String[] args) throws IOException {
		Selector selector = Selector.open();
		//selector.
		//open a file in read/write mode and
		RandomAccessFile fromFile = new RandomAccessFile("fromFile.txt", "rw");
		FileChannel      fromChannel = fromFile.getChannel();
		
		RandomAccessFile toFile = new RandomAccessFile("toFile.txt", "rw");
		FileChannel      toChannel = toFile.getChannel();
		
		long position = 0;
		long count = fromChannel.size();
		
		toChannel.transferFrom(fromChannel, position, count);
		fromChannel.transferTo(position, count, toChannel)
	}

}
