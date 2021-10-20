package com.example.nio;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FileLockExample {

	public static void main(String[] args) throws IOException {
		String input = "Demo text to be written in locked mode.";
		System.out.println("Input string to the test file is : " + input);
		ByteBuffer buf = ByteBuffer.wrap(input.getBytes());
		String fp = "g:/temp/data/file.txt";
		Path pt = Paths.get(fp);
		FileChannel channel = FileChannel.open(pt, StandardOpenOption.WRITE);
		channel.position(channel.size());
		FileLock lock = channel.lock();
		System.out.println("The lock is shared : " + lock.isShared());
		channel.write(buf);
		channel.close();
		System.out.println("content writting is complete. Therefore close the channel and release the lock..");
		PrintFileCreated.print(fp);
	}
}
