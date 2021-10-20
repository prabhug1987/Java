package com.example.concurrent.threads;

import java.util.concurrent.TimeUnit;

public class LoopTaskA implements Runnable {

	private static int count = 0;
	private int id;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("######< Task-" + id + "> Starting #####");
		for (int i = 0; i < 10; i++) {
			System.out.println("<" + id + "> Tick tick " + i);
		}

		try {
			TimeUnit.MILLISECONDS.sleep((long) (Math.random() * 1000));
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		System.out.println("##### Task " +id+" done ****** ");
	}

	public LoopTaskA() {
		// TODO Auto-generated constructor stub
		this.id = ++count;
	}

}
