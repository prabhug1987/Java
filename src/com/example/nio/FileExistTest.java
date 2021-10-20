package com.example.nio;

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FileExistTest {
	
	public static void main(String[] args) throws IOException {
		Path path = Paths.get("data/test-write.txt");
		boolean pathExists = Files.exists(path, LinkOption.NOFOLLOW_LINKS);
		
		path = Paths.get("g:/temp/data/nio-data.txt");
		try {
			Path newDir = Files.createDirectories(path);
		}catch (FileAlreadyExistsException e) {
			// TODO: handle exception
			e.printStackTrace();
		}catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		// copy a file from one location to another location
		Path sourcePath      = Paths.get("data/logging.properties");
		Path destinationPath = Paths.get("data/logging-copy.properties");

		try {
		    Files.copy(sourcePath, destinationPath);
		} catch(FileAlreadyExistsException e) {
		    //destination file already exists
		} catch (IOException e) {
		    //something else went wrong
		    e.printStackTrace();
		}
		
		// move a file from one path to another directory
		sourcePath      = Paths.get("data/logging-copy.properties");
		destinationPath = Paths.get("data/subdir/logging-moved.properties");

		try {
		    Files.move(sourcePath, destinationPath,
		            StandardCopyOption.REPLACE_EXISTING);
		} catch (IOException e) {
		    //moving file failed.
		    e.printStackTrace();
		}
		
		destinationPath = Paths.get("data/subdir/logging-moved.properties");

		try {
		    Files.delete(destinationPath);
		} catch (IOException e) {
		    //moving file failed.
		    e.printStackTrace();
		}
	}
	

}
