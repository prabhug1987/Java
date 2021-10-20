package com.example.concurrent.executors;

import java.util.concurrent.ThreadFactory;

import tuts.common.LoopTaskC;

public class NamedThreadFactory implements ThreadFactory {

	private static int count = 0;
	private static String NAME = "My Thread - ";
	
	@Override
	public Thread newThread(Runnable r) {
		// TODO Auto-generated method stub
		Thread thread = new Thread(r, NAME + ++count);
		
		return thread;
	}

}
