package com.example.nio.file;

import java.nio.file.Path;
import java.nio.file.Paths;

public class AbsoulutePath {

	public static void main(String[] args) {
		Path absolutePath = Paths.get("F:\\Softwares\\workspace-eclipse\\Java", "example.txt");
		Path absolutePath1 = Paths.get("F:\\Softwares\\workspace-eclipse\\Java", "sample.txt");

		Path absolutePath2 = Paths.get("F:\\Softwares", "workspace-eclipse\\Java", "example.txt");
	}
}
