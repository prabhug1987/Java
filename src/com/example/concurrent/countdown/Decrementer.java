package com.example.concurrent.countdown;

import java.util.concurrent.CountDownLatch;

public class Decrementer implements Runnable {

	CountDownLatch countDownLatch = null;

	public Decrementer(CountDownLatch countDownLatch) {
		// TODO Auto-generated constructor stub
		this.countDownLatch = countDownLatch;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(1000);
			this.countDownLatch.countDown();
			Thread.sleep(1000);
			this.countDownLatch.countDown();

			Thread.sleep(1000);
			this.countDownLatch.countDown();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}
}
