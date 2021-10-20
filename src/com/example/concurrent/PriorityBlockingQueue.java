package com.example.concurrent;

import java.util.concurrent.BlockingQueue;

public class PriorityBlockingQueue {

	public static void main(String[] args) {
		BlockingQueue<String> priorityBlockingQueue = new PriorityBlockingQueue<String>();
		
		new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				priorityBlockingQueue.take();
			}
			
		});
		
		
	}
}
