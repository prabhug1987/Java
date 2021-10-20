package com.example.nio.file;

import java.nio.file.FileSystems;
import java.nio.file.Path;

public class RelativePathExample {

	public static void main(String[] args) {
		Path relativePath1 = FileSystems.getDefault().getPath("data.txt");
		System.out.println(relativePath1);

	}
}
