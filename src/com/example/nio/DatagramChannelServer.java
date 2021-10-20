package com.example.nio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.DatagramChannel;

public class DatagramChannelServer {

	public static void main(String[] args) {
		DatagramChannel server;
		try {
			server = DatagramChannel.open();
			InetSocketAddress inetSocketAddress = new InetSocketAddress("localhost",7979);
			server.bind(inetSocketAddress);
			System.out.println("server started "+ inetSocketAddress);
			
			ByteBuffer buffer = ByteBuffer.allocate(1024);
			SocketAddress remoteAdd = server.receive(buffer);
			buffer.flip();
			int limits = buffer.limit();
			byte bytes[] = new byte[limits]; 
			buffer.get(bytes,0,limits);
			String msg = new String(bytes);
			System.out.println("Client at "+ inetSocketAddress + " sent : "+ msg);
			server.send(buffer,inetSocketAddress);
			server.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
