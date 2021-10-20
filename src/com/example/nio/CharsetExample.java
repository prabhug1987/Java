package com.example.nio;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;

public class CharsetExample {
	public static void main(String[] args) {
		Charset charset = Charset.forName("US-ASCII");
		System.out.println(charset.displayName());
		System.out.println(charset.canEncode());
		String str = "Demo text for conversion.";
		// convert byte buffer in given charset to char buffer in unicode
		ByteBuffer byteBuffer = ByteBuffer.wrap(str.getBytes());
		CharBuffer charBuffer = charset.decode(byteBuffer);
		// convert char buffer in unicode to byte buffer in given charset
		ByteBuffer newByteBuffer = charset.encode(charBuffer);
		while (newByteBuffer.hasRemaining()) {
			char ch = (char) newByteBuffer.get();
			System.out.print(ch);
		}
		newByteBuffer.clear();
	}
}