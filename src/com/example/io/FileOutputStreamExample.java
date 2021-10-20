package com.example.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

public class FileOutputStreamExample {
	
	public static void main(String[] args) throws FileNotFoundException {
		OutputStream outputStream = new FileOutputStream("G:/temp/data/file.txt");
		PrintStream printStream = new PrintStream(outputStream);
	}

}
