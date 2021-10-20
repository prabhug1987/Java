package com.example.concurrent.threads;

import java.util.concurrent.TimeUnit;

public class ThreadAliveCheck {

	public static void main(String[] args) {
		String currentThreadName = Thread.currentThread().getName();
		System.out.println("[ " + currentThreadName + "] main thread starts here");

		Thread t1 = new Thread(new LoopTaskA(), "MyThread-1");
		Thread t2 = new Thread(new LoopTaskA(), "MyThread-2");

		boolean t1IsAlive = t1.isAlive();
		boolean t2IsAlive = t2.isAlive();

		System.out.println("[ " + currentThreadName + "]before starting: IS " + t1.getName() + " alive = " + t1IsAlive);
		System.out.println("[ " + currentThreadName + "]before starting: IS " + t2.getName() + " alive = " + t2IsAlive);

		t1.start();
		t2.start();

		while (true) {
			try {
				TimeUnit.MILLISECONDS.sleep(100);
				t1IsAlive = t1.isAlive();
				t2IsAlive = t2.isAlive();
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}

			System.out.println("[ " + currentThreadName + "] is " + t1.getName() + " alive = " + t1IsAlive);
			System.out.println("[ " + currentThreadName + "] is " + t1.getName() + " alive = " + t2IsAlive);
			if (!t1IsAlive && !t2IsAlive) {
				break;
			}

		}

		System.out.println("[ " + currentThreadName + "] main thread ends here");
	}
}
