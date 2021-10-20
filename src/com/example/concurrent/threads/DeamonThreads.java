package com.example.concurrent.threads;

import tuts.common.LoopTaskD;

public class DeamonThreads {

	public static void main(String[] args) {
		String currentThreadName = Thread.currentThread().getName();
		System.out.println("[ "+ currentThreadName +"] main thread starts here" );
		
		Thread t1 = new Thread(new LoopTaskD(500));
		t1.setDaemon(true);
		t1.start();
		
		Thread t2 = new Thread(new LoopTaskD(1000));
		//t2.setDaemon(true);
		t2.start();
	
		System.out.println("[ "+ currentThreadName +"] main thread starts here" );
	}
}
