package com.example.nio.selector;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.DatagramChannel;
import java.nio.channels.ServerSocketChannel;

public class ServerSocketExample {

	public static void main(String[] args) {
		ServerSocketChannel serverSocketChannel;
		try {
			serverSocketChannel = ServerSocketChannel.open();
			serverSocketChannel.socket().bind(new InetSocketAddress(7070));
			
			DatagramChannel channel = DatagramChannel.open();
			channel.socket().bind(new InetSocketAddress(7070));
			
			ByteBuffer byteBuffer = ByteBuffer.allocate(48);
			byteBuffer.clear();
			channel.receive(byteBuffer);
			
			String newData = "New String to write to file..."
                    + System.currentTimeMillis();
    
			ByteBuffer buf = ByteBuffer.allocate(48);
			buf.clear();
			buf.put(newData.getBytes());
			buf.flip();
			
			int bytesSent = channel.send(buf, new InetSocketAddress("jenkov.com", 80));

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
