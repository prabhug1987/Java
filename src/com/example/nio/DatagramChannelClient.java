package com.example.nio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.DatagramChannel;

public class DatagramChannelClient {
	
	public static void main(String[] args) {
		DatagramChannel datagramChannel = null;
		try {
			datagramChannel = DatagramChannel.open();
			datagramChannel.bind(null);
			String msg = "Hello world";
			ByteBuffer buffer = ByteBuffer.wrap(msg.getBytes());
			InetSocketAddress serverAddress = new InetSocketAddress("localhost",7979);
			datagramChannel.send(buffer,serverAddress);
			buffer.clear();
			datagramChannel.receive(buffer);
			buffer.flip();
			
			datagramChannel.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
