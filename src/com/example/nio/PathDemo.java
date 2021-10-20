package com.example.nio;

import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathDemo {

	public static void main(String[] args) {
		Path relative = Paths.get("file2.txt");
		System.out.println("Relative path " + relative);
		Path absolute = relative.toAbsolutePath();

		System.out.println("Absoulute path" + absolute);

		Path path = Paths.get("F:\\Softwares\\workspace-eclipse\\Java\\file2.txt");
		FileSystem fs = path.getFileSystem();
		System.out.println(fs.toString());
		System.out.println(fs.isReadOnly());
		System.out.println(fs.isOpen());
		System.out.println(path.getNameCount());
		System.out.println(path.getFileName());
		System.out.println(path.compareTo(relative));
		System.out.println(path.isAbsolute());
		System.out.println(path.getFileName());
		System.out.println(path.getFileSystem());
		System.out.println(path.getName(0));
		System.out.println(path.getParent());
		System.out.println(path.getRoot());
		System.out.println(path.subpath(0, 1));
		System.out.println(path.toAbsolutePath().toString());
		
		try {
			Path realPath = path.toRealPath(LinkOption.NOFOLLOW_LINKS);
			System.out.println(realPath.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Path path2 = path.normalize();
		
		System.out.println("path 2"+ path2);
		
		Path path1 = FileSystems.getDefault()
	            .getPath(System.getProperty("user.home"), "downloads", "somefile.txt");
	}

}
