package com.example.nio;

import java.nio.file.Path;
import java.nio.file.Paths;
public class PathExample {

	public static void main(String[] args) {
		Path currentDir = Paths.get("g:/temp/./");
		System.out.println(currentDir);
		Path parentDir = Paths.get("g:/temp/..");
		System.out.println(parentDir);
		
		
		Path basePath = Paths.get("/data");
		Path path     = Paths.get("/data/subdata/subsubdata/myfile.txt");

		Path basePathToPath = basePath.relativize(path);
		Path pathToBasePath = path.relativize(basePath);

		System.out.println(basePathToPath);
		System.out.println(pathToBasePath);
		
		String originalPath =
		        "d:\\data\\projects\\a-project\\..\\another-project";

		Path path1 = Paths.get(originalPath);
		System.out.println("path1 = " + path1);

		Path path2 = path1.normalize();
		System.out.println("path2 = " + path2);
	}
}
