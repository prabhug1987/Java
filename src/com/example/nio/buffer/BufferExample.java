package com.example.nio.buffer;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;

public class BufferExample {

	public static void main(String[] args) {
		ByteBuffer buffer = ByteBuffer.allocate(40);
		// byte buffer to char buffer
		CharBuffer charBuffer = buffer.asCharBuffer();
		charBuffer.put("how to do it in java");
		
		charBuffer.flip();
		
		String s = charBuffer.toString();
		System.out.println(s);
	}
}
