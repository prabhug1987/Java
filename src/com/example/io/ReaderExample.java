package com.example.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PushbackInputStream;
import java.io.PushbackReader;
import java.io.Reader;

public class ReaderExample {
	
	public static void main(String[] args) throws IOException {
		Reader reader = new FileReader("G:/temp/data/textfile.txt");
		int data = reader.read();
		while(data != -1) {
			char dataChar = (char) data;
			data = reader.read();
		}
		
		PushbackReader reader1 = new PushbackReader(reader);
		
		while(data != -1) {
			char dataChar = (char) data;
			data = reader1.read();
		}
	}

}
