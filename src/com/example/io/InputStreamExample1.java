package com.example.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamExample1 {
	
	public static void main(String[] args) throws IOException {
		InputStream input = null;
		try {
			input = new FileInputStream("g:/temp/data/one.txt");
			int data = input.read();
			while (data != -1 ) {
				doSomethingWithData(data);
				data = input.read();
			}
		}catch(IOException ex) {
			System.out.println(ex);
		}finally {
			if(input != null)
				input.close();
		}
	}

	private static void doSomethingWithData(int data) {
		// TODO Auto-generated method stub
		
	}

}
