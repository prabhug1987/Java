package com.example.nio;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousFileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.concurrent.Future;

public class AsynchronousFileWritingExample {
	
	public static void main(String[] args) throws IOException {
		Path path = Paths.get("data/test-write.txt");
		// will spawn a new thread for opening a file in write mode
		AsynchronousFileChannel fileChannel = 
		    AsynchronousFileChannel.open(path, StandardOpenOption.WRITE);

		ByteBuffer buffer = ByteBuffer.allocate(1024);
		long position = 0;
        
		// write the data into the memory
		buffer.put("test data".getBytes());
		// move to first position of a buffer
		buffer.flip();

		// write using future class
		Future<Integer> operation = fileChannel.write(buffer, position);
		buffer.clear();

		while(!operation.isDone());

		System.out.println("Write done");
	}

}
