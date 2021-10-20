package com.example.concurrent.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import tuts.common.LoopTaskD;

public class DeamonThreadsUsingExecutor {

	public static void main(String[] args) {
		String currentThreadName = Thread.currentThread().getName();

		System.out.println("[" + currentThreadName + "] main thread starts here ...");
		ExecutorService executorService = Executors.newCachedThreadPool(new DeamonThreadsFactory());
		executorService.execute(new LoopTaskD(200));
		executorService.execute(new LoopTaskD(100));
		executorService.execute(new LoopTaskD(200));
		executorService.execute(new LoopTaskD(100));
		
		System.out.println("[" + currentThreadName + "] main thread ends here ...");

	}
}
