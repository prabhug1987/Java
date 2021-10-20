package com.example.nio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ScatteringByteChannel;

public class ScatterExample {
	private static String FILENAME = "g:/temp/data/nio-data.txt";

	public static void main(String[] args) {
		ByteBuffer bLen1 = ByteBuffer.allocate(1024);
		ByteBuffer bLen2 = ByteBuffer.allocate(1024);
		FileInputStream in;
		try {
			in = new FileInputStream(FILENAME);
			//it is used to combine two/morethan one buffers into single one buffer
			ScatteringByteChannel scatter = in.getChannel();
			scatter.read(new ByteBuffer[] { bLen1, bLen2 });
			bLen1.position(0);
			bLen2.position(0);
			int len1 = bLen1.asIntBuffer().get();
			int len2 = bLen2.asIntBuffer().get();
			System.out.println("Scattering : Len1 = " + len1);
			System.out.println("Scattering : Len2 = " + len2);
		} catch (FileNotFoundException exObj) {
			exObj.printStackTrace();
		} catch (IOException ioObj) {
			ioObj.printStackTrace();
		}
	}
}