package com.example.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamExample {
	
	public static void main(String[] args) throws IOException {
		OutputStream outputStream = new FileOutputStream("G:/temp/data/file.txt");
		outputStream.write("Hello World".getBytes());
		outputStream.close();
	}

}
