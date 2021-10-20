package com.example.nio;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class BasicChannelExample {

	public static void main(String[] args) {
		try {
			//reverse you have to give single forward slash when you open a file from a path
			RandomAccessFile randomAccessFile = new RandomAccessFile("G:/temp/data/nio-data.txt", "rw"); // open a file in read-write mode
			FileChannel inChannel = randomAccessFile.getChannel(); // create a channel from a random accessfile
			ByteBuffer buf = ByteBuffer.allocate(48); // define a buffer and allocate with value
			int bytesRead = inChannel.read(buf);
			while (bytesRead != -1) { // read the buffer until it reaches the end of file or buffer
				System.out.println("Read" + bytesRead);
				buf.flip(); // make the buffer ready for read
				while (buf.hasRemaining()) { // check if it has remaining data in it
					System.out.println((char) buf.get()); // get the data from the buffer
				}

				buf.clear(); // make the buffer ready for writing in the next iteration
				bytesRead = inChannel.read(buf);
			}

			randomAccessFile.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
