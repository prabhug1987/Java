package com.example.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamExample {
	
	public static void main(String[] args) throws FileNotFoundException {
		InputStream inputStream = new FileInputStream("g:/temp/data/file.txt");
		int data;
		try {
			data = inputStream.read();
			while(data != -1) {
				data =inputStream.read();
				System.out.println(data);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
