package com.example.nio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PrintFileCreated {

	/*
	 *  @param path as string value
	 *   
	 */
	public static void print(String path) throws IOException {
		FileReader fileReader = new FileReader(path);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		String tr = bufferedReader.readLine();
		System.out.println("The Content of testout.txt file is : ");
		while (tr != null) {
			System.out.println("" + tr);
			tr = bufferedReader.readLine();
		}

		fileReader.close();
		bufferedReader.close();
	}

}
