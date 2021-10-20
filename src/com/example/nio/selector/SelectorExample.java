package com.example.nio.selector;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;

public class SelectorExample {
	
	public static void main(String[] args) throws IOException {
		RandomAccessFile aFile     = new RandomAccessFile("g:/temp/data/nio-data.txt", "rw");
		FileChannel      inChannel = aFile.getChannel();
		
		inChannel.force(true);
		inChannel.truncate(10);
		inChannel.size();
	}

}
