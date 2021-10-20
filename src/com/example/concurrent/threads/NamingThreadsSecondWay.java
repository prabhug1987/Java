package com.example.concurrent.threads;

import java.util.concurrent.TimeUnit;

import tuts.common.LoopTaskB;
import tuts.common.LoopTaskC;

public class NamingThreadsSecondWay {

	public static void main(String[] args) {
		String currentThreadName = Thread.currentThread().getName();
		System.out.println("[ " + currentThreadName + "] main thread starts here");

		new Thread(new LoopTaskC(), "MyThread-1").start();

		Thread t = new Thread(new LoopTaskC());

		t.start();
		try {
			TimeUnit.MILLISECONDS.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		t.setName("MyThread-2");
		System.out.println("[ " + currentThreadName + "] main thread starts here");
	}

}
