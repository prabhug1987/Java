package com.example.concurrent.countdown;

import java.util.concurrent.CountDownLatch;

public class Waiter implements Runnable {

	CountDownLatch countDownLatch = null;
	
	public Waiter(CountDownLatch countDownLatch) {
		// TODO Auto-generated constructor stub
		this.countDownLatch = countDownLatch;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			countDownLatch.await();
		}catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		System.out.println("Waiter released");
		
	}
}
