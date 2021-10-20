package com.example.concurrent.threads;

import tuts.common.LoopTaskB;

public class NamingThreadsFirstWay {

	public static void main(String[] args) {
		String currentThreadName = Thread.currentThread().getName();
		System.out.println("[ "+ currentThreadName +"] main thread starts here" );
		
		new Thread(new LoopTaskB()).start();
		
		Thread t = new Thread(new LoopTaskB());
		
		t.start();
		
		System.out.println("[ "+ currentThreadName +"] main thread starts here" );
	}

}
