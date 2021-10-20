package com.example.io;

import java.io.PipedInputStream;

public class PipedOutputStream {
	
	public static void main(String[] args) {
		final PipedOutputStream output = new PipedOutputStream();
		final PipedInputStream input = new PipedInputStream();
		
		Thread thread1 = new Thread(new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					output.write("Hello world, pipe !".getBytes());
				} catch (Exception e) {
					// TODO: handle exception
				}
				
			}
		});
		
		Thread thread2 = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				
			}
			
		});
		
		thread1.start();
		thread2.start();
		
		
	}

}
