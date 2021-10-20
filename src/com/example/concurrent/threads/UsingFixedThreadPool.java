package com.example.concurrent.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class UsingFixedThreadPool {

	public static void main(String[] args) {
		System.out.println("main thread starts here...");
		ExecutorService executorService = Executors.newFixedThreadPool(5);
		
		executorService.execute(new LoopTaskA());
		executorService.execute(new LoopTaskA());
		executorService.execute(new LoopTaskA());
		
		executorService.execute(new LoopTaskA());
		executorService.execute(new LoopTaskA());
		
		executorService.shutdown();
		//executorService.execute(new LoopTaskA());
		
		System.out.println("main thread ends here...");
	}
}
