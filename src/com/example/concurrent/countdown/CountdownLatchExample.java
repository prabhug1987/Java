package com.example.concurrent.countdown;

import java.util.concurrent.CountDownLatch;

public class CountdownLatchExample {
	public static void main(String[] args) {
		CountDownLatch countDownLatch = new CountDownLatch(3);
		Waiter waiter = new Waiter(countDownLatch);
		Decrementer decrementer = new Decrementer(countDownLatch);
		
		new Thread(waiter).start();
		new Thread(decrementer).start();
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
