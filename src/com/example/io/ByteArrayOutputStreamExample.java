package com.example.io;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

public class ByteArrayOutputStreamExample {
	
	public static void main(String[] args) {
		ByteArrayOutputStream ouputStream = new ByteArrayOutputStream();
		//ouputStream.writeTo("This text is converted to bytes ");
		byte bytes[] = ouputStream.toByteArray();
	}

}
