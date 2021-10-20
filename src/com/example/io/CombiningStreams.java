package com.example.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class CombiningStreams {

	public static void main(String[] args) throws FileNotFoundException {
		InputStream inputStream = new BufferedInputStream(new FileInputStream("C:/data/input-file.txt"));
	}
}
