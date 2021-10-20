package com.example.concurrent;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable{

	protected BlockingQueue blockingQueue;
	
	public Consumer(BlockingQueue blockingQueue) {
		// TODO Auto-generated constructor stub
		this.blockingQueue = blockingQueue;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			System.out.println(blockingQueue.take());
			System.out.println(blockingQueue.take());
			System.out.println(blockingQueue.take());
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
