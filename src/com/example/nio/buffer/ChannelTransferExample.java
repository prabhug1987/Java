package com.example.nio.buffer;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;

public class ChannelTransferExample {

	public static void main(String[] args) throws IOException {
		// list of input files
		String[] inputFiles = new String[] { "inputFile1.txt", "inputFile2.txt", "inputFile3.txt" };

		// declare a output file name or location
		String outputFile = "outputFile.txt";
		FileOutputStream fos = new FileOutputStream(new File(outputFile));
		
		//try(fos) not working
		
		try  {
			// open the file output stream for writing

			// Get channel for output file
			WritableByteChannel targetChannel = fos.getChannel();

			for (int i = 0; i < inputFiles.length; i++) {
				try(FileInputStream fileInputStream = new FileInputStream(inputFiles[i])) {
					// read the files using file input stream
					
					// get the file channel from inputstream
					FileChannel inputChannel = fileInputStream.getChannel();

					// transfer data from input channel to output channel

					inputChannel.transferTo(0, inputChannel.size(), targetChannel);
					
					//close the input channel
		            inputChannel.close();
		            fileInputStream.close();
		            
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				
			}

			//finally close the target channel
	        targetChannel.close();
	        fos.close();
		
		} catch (FileNotFoundException e) {

		}
	}
}
