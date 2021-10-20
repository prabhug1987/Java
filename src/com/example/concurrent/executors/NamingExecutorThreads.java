package com.example.concurrent.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import tuts.common.LoopTaskC;

public class NamingExecutorThreads {

	public static void main(String[] args) {
		String currentThreadName = Thread.currentThread().getName();
		System.out.println("[ " + currentThreadName + "] main thread starts here");

		ExecutorService executorService = Executors.newCachedThreadPool(new NamedThreadFactory());
		
		executorService.execute(new LoopTaskC());
		executorService.execute(new LoopTaskC());
		executorService.execute(new LoopTaskC());
		
		try {
			TimeUnit.MILLISECONDS.sleep(15);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		executorService.execute(new LoopTaskC());
		executorService.execute(new LoopTaskC());
		executorService.execute(new LoopTaskC());
		executorService.execute(new LoopTaskC());
		executorService.execute(new LoopTaskC());
		executorService.shutdown();
				
		System.out.println("[ " + currentThreadName + "] main thread starts here");

	}
}
