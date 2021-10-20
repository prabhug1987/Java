package com.example.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class WriterExample {
	
	public static void main(String[] args) throws FileNotFoundException {
		try {
			Writer writer = new FileWriter("g:/temp/data/data.txt");
			writer.write("Hello world writer");
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		OutputStream outputStream = new FileOutputStream("g:/temp/data/data.txt");
		Writer writer = new OutputStreamWriter(outputStream);
		
		Reader reader = new BufferedReader(new FileReader(""));
		Writer writer = new BufferedWriter(new FileWriter(""));
	}

}
