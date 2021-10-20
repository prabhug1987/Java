package com.example.nio.buffer;

import java.nio.CharBuffer;

public class CharBufferExample {

	public static void main(String[] args) {
		CharBuffer charBuffer = CharBuffer.allocate(100);

		char[] myArray = new char[100];
		CharBuffer charBuffer1 = CharBuffer.wrap(myArray);

		CharBuffer charBuffer2 = CharBuffer.wrap(myArray,12,42);
		System.out.println(charBuffer.toString());
		
		//this will produce bufferoverflow exception when try to put a sequence of chars more than allocated size 
		//charBuffer2.put("The is an example to put a lenthy string in a char buffer to experiment buffer overflow exception");
		charBuffer.put(0, 'M').put('w');
		
		charBuffer.limit(charBuffer.position()).position(0);
		System.out.println("buffer remaining count "+charBuffer.remaining());
		
		for(int i = 0; charBuffer.hasRemaining();i++) 
			System.out.println(charBuffer.get());
		
		charBuffer.compact();
		
		CharBuffer charBuffer4 = charBuffer.allocate(100);
		
		// resetting after a declaration will throw invalid mark exception
		//charbuffer4.reset();
		// to check buffer 1 is equal to buffer for or not
		System.out.println("char buffer is equals with charbuffer 4 "+ charBuffer.equals(charBuffer4));
		
		CharBuffer buffer = CharBuffer.allocate(8);
		buffer.position(3).limit(5);
		CharBuffer sliceBuffer = buffer.slice();
		
	}
}
