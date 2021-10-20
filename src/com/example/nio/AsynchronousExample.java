package com.example.nio;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousChannel;
import java.nio.channels.AsynchronousFileChannel;
import java.nio.channels.CompletionHandler;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.concurrent.Future;

public class AsynchronousExample {

	public static void main(String[] args) throws IOException {
		// read file using nio paths class
		Path path = Paths.get("G:/temp/data/nio-data.txt");

		AsynchronousChannel asynchronousChannel;
		// use asynchronous file channel for read operation
		AsynchronousFileChannel fileChannel = AsynchronousFileChannel.open(path, StandardOpenOption.READ);

		ByteBuffer byteBuffer = ByteBuffer.allocate(10);

		long position = 0;
		//use a future class for read byte buffer
		Future<Integer> operation = fileChannel.read(byteBuffer, 0);
		
		while (!operation.isDone());
		
		byteBuffer.flip();
		byte[] data = new byte[byteBuffer.limit()];
		byteBuffer.get(data);
		System.out.println(new String(data));
		byteBuffer.clear();
		
		fileChannel.read(byteBuffer, position, byteBuffer, new CompletionHandler<Integer, ByteBuffer>() {
			@Override
			public void completed(Integer result, ByteBuffer attachment) {
				// TODO Auto-generated method stub
				System.out.println("result "+ result);
				attachment.flip();
				byte[] data = new byte[attachment.limit()];
				attachment.get(data);
				System.out.println(new String(data));
				attachment.clear();
			}
			@Override
			public void failed(Throwable exc, ByteBuffer attachment) {
				// TODO Auto-generated method stub
				
			}
		});
	}

}
