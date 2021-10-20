package com.example.net;

import java.net.URI;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.spi.FileSystemProvider;

public class URIExample {

	public static void main(String[] args) {
		URI uri = URI.create("file:/F:/Softwares/workspace-eclipse/Java/sample.txt");

		System.out.println(uri.getAuthority());
		System.out.println(uri.getFragment());

		String scheme = uri.getScheme();
		System.out.println(scheme);

		if (scheme.equalsIgnoreCase("file")) {
			String absPath = FileSystems.getDefault().provider().getPath(uri).toAbsolutePath().toString();
		}

		for (FileSystemProvider provider : FileSystemProvider.installedProviders()) {
			String absPath = null;
			if (provider.getScheme().equalsIgnoreCase(scheme)) {
				absPath = provider.getPath(uri).toAbsolutePath().toString();
			}
			System.out.println("abs path is "+ absPath);
		}
		
		FileSystem fs = FileSystems.getDefault();
		Path path1 = fs.getPath("src/sample.txt");
		System.out.println(path1);
		Path path2 = fs.getPath("sample.txt");
		
		System.out.println(path2);

	}

}
