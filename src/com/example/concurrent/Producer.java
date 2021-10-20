package com.example.concurrent;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {

	protected BlockingQueue blockingQueue;

	public Producer(BlockingQueue blockingQueue) {
		// TODO Auto-generated constructor stub
		this.blockingQueue = blockingQueue;
	}

	@Override
	public void run() {

		try {

			blockingQueue.put(1);
			Thread.sleep(1000);
			blockingQueue.put(2);
			Thread.sleep(1000);
			blockingQueue.put(3);
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
