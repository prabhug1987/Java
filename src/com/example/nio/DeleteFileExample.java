package com.example.nio;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class DeleteFileExample {

	public static void main(String[] args) {
		Path rootPath = Paths.get("data/to-delete");

		try {
		  Files.walkFileTree(rootPath, new SimpleFileVisitor<Path>() {
		    @Override
		    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
		      System.out.println("delete file: " + file.toString());
		      Files.delete(file);
		      return FileVisitResult.CONTINUE;
		    }

		    @Override
		    public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
		      Files.delete(dir);
		      System.out.println("delete dir: " + dir.toString());
		      return FileVisitResult.CONTINUE;
		    }
		  });
		} catch(IOException e){
		  e.printStackTrace();
		}	
	}
}
