package com.example.nio.selector;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.Pipe;

public class PipeExample {
	
	public static void main(String[] args) throws IOException {
		Pipe pipe = Pipe.open();
		Pipe.SinkChannel sinkChannel = pipe.sink();
		
		String newData = "New String to write to file..." + System.currentTimeMillis();
		
		ByteBuffer buffer = ByteBuffer.allocate(48);
		buffer.clear();
		buffer.put(newData.getBytes());
		buffer.flip();
		while(buffer.hasRemaining()) {
			sinkChannel.write(buffer);
		}
		
		Pipe.SourceChannel sourceChannel = pipe.source();
		ByteBuffer byteBuffer = ByteBuffer.allocate(48);
		int byteRead = inChannel.read(byteBuffer);
		
	}

}
