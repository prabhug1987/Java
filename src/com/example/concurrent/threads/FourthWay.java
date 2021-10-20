package com.example.concurrent.threads;

import java.util.concurrent.TimeUnit;

public class FourthWay {

	public static void main(String[] args) {
		
		System.out.println("Main thread starts here...");
		new Thread(new FourthTask()).start();
		
		Thread t = new Thread(new FourthTask());
		t.start();
		
		System.out.println("Main thread end here...");
	}
}

class FourthTask implements Runnable {

	private static int count = 0;
	private int id;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			System.out.println("<" + id + "> Tick tick " + i);
		}

		try {
			TimeUnit.MILLISECONDS.sleep(100);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public FourthTask() {
		// TODO Auto-generated constructor stub
		this.id = ++count;
	}
}
