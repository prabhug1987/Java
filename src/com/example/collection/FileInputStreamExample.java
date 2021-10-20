package com.example.collection;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class FileInputStreamExample {
	
	public static void main(String[] args) throws FileNotFoundException {
		InputStream inputStream = new FileInputStream("g:/temp/data/file.txt");
		process(inputStream);
	}

	private static void process(InputStream inputStream) {
		// TODO Auto-generated method stub
		
	}
}
