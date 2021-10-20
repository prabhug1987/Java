package com.example.nio;

import java.nio.ByteBuffer;
import java.util.Arrays;

public class ByteBufferExample {
	
	public static void main(String[] args) {
		// defining and allocating bytebuffer
		//using allocate() method
		ByteBuffer byteBuffer = ByteBuffer.allocate(4);
		
		// put byte value in byte buffer using put() method
		byteBuffer.put((byte)20);
		byteBuffer.put((byte)30);
		byteBuffer.put((byte)40);
		
		// mark will be going to discarded by limit()
		byteBuffer.mark();
		
		//print the byte buffer
		System.out.println("Bytebuffer before compact : "+ Arrays.toString(byteBuffer.array())+" \n position : "+ byteBuffer.position() + "\n limit "+ byteBuffer.limit());
		//limit the byte buffer using limit method
		byteBuffer.limit(4);
		
		// pring the byte buffer
		System.out.println("Bytebuffer after compact : "+ Arrays.toString(byteBuffer.array())+" \n position : "+ byteBuffer.position() + "\n limit "+ byteBuffer.limit());
	}

}
