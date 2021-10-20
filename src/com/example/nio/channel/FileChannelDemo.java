package com.example.nio.channel;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.HashSet;
import java.util.Set;

public class FileChannelDemo {
	
	public static void main(String[] args) {
		//append the content to existing file
		writeFileChannel(ByteBuffer.wrap("Welcome to Tutorial point ".getBytes()));
		//read the file
		readFileChannel();
	}

	private static void readFileChannel()  {
		// TODO Auto-generated method stub
		try {
			// read a file
			RandomAccessFile randomAccessFile = new RandomAccessFile("G:/temp/data/temp.txt","rw");
			FileChannel fileChannel = randomAccessFile.getChannel();
			ByteBuffer byteBuffer = ByteBuffer.allocate(512);
			Charset charset = Charset.forName("US-ASCII");
			
			while(fileChannel.read(byteBuffer) > 0 ) {
				byteBuffer.rewind();
				
				System.out.println(charset.decode(byteBuffer));
				byteBuffer.flip();
				
			}
			
			fileChannel.close();
			randomAccessFile.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private static void writeFileChannel(ByteBuffer byteBuffer) {
		// TODO Auto-generated method stub
		
		Set<StandardOpenOption> options = new HashSet<>();
		options.add(StandardOpenOption.CREATE);
		options.add(StandardOpenOption.APPEND);
		Path path = Paths.get("G:/temp/data/temp.txt");
		try {
			FileChannel fileChannel = FileChannel.open(path, options);
			fileChannel.write(byteBuffer);
			fileChannel.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
