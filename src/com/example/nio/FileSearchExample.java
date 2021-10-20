package com.example.nio;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class FileSearchExample {

	public static void main(String[] args) {
		Path rootPath = Paths.get("data");
		String fileToFind = File.separator + "README.txt";

		try {
		  Files.walkFileTree(rootPath, new SimpleFileVisitor<Path>() {
		    
		    @Override
		    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
		      String fileString = file.toAbsolutePath().toString();
		      //System.out.println("pathString = " + fileString);

		      // find files that are end with readme.txt
		      if(fileString.endsWith(fileToFind)){
		        System.out.println("file found at path: " + file.toAbsolutePath());
		        return FileVisitResult.TERMINATE;
		      }
		      return FileVisitResult.CONTINUE;
		    }
		  });
		} catch(IOException e){
		    e.printStackTrace();
		}
	}
}
