package com.example.concurrent.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

import tuts.common.FactorialTaskA;
import tuts.common.LoopTaskE;

public class TeminatingExecutorTasksFirstWay {

	public static void main(String[] args) throws InterruptedException {
		String currentThreadName = Thread.currentThread().getName();
		System.out.println("[" + currentThreadName + "] main thread starts here ...");
		
		ExecutorService executorService = Executors.newCachedThreadPool(new NamedThreadFactory());
		
		LoopTaskE loopTaskE = new LoopTaskE();
		FactorialTaskA factorialTaskA = new FactorialTaskA(30, 1000);
		executorService.execute(loopTaskE);
		Future<Long> result = executorService.submit(factorialTaskA);
		
		executorService.shutdown();
		
		TimeUnit.MILLISECONDS.sleep(3000);
		
		loopTaskE.cancel();
		factorialTaskA.cancel();
				
		System.out.println("[" + currentThreadName + "] main thread ends here ...");
	}
}
