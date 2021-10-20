package com.example.concurrent;

import java.util.concurrent.SynchronousQueue;

public class SynchronizedQueueDemo {

	public static void main(String[] args) {
		final SynchronousQueue<String> queue = new SynchronousQueue<>();
		
		Thread producer = new Thread("producer") {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				String event = "Four";

				try {
					queue.put(event);
					System.out.printf("[%s] published event : %s %n", Thread .currentThread().getName(), event);

				}catch (InterruptedException e) {
					// TODO: handle exception
					e.printStackTrace();
				}
				
			}
		};
		
		producer.start();
		

		Thread consumer = new Thread("consumer") {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				

				try {
					String event = queue.take();
					System.out.printf("[%s] published event : %s %n", Thread .currentThread().getName(), event);

				}catch (InterruptedException e) {
					// TODO: handle exception
					e.printStackTrace();
				}
				
			}
		};
		
		consumer.start();

		
	}
}
