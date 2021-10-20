package com.example.concurrent.countdown;

import java.util.concurrent.ForkJoinPool;

public class ForkJoinPoolExample {

	public static void main(String[] args) {
		ForkJoinPool forkJoinPool = new ForkJoinPool(4);
		
		forkJoinPool.invoke(new MyRecursiveAction(24));
		
		long result = forkJoinPool.invoke(new MyRecursiveTask(128));
		
		System.out.println("result is "+result);
		
	}
}
