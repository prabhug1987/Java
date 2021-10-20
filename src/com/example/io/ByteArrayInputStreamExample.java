package com.example.io;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ByteArrayInputStreamExample {
    public static void main(String[] args) throws IOException {
		byte[] bytes = new byte[1024];
		InputStream input = new ByteArrayInputStream(bytes);
		
		int data = input.read();
		while(data!= -1) {
			data = input.read();
		}
	}

}
