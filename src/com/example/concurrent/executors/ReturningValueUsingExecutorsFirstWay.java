package com.example.concurrent.executors;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import tuts.common.LoopTaskA;

public class ReturningValueUsingExecutorsFirstWay {

	public static void main(String[] args) {
		String currentThreadName = Thread.currentThread().getName();

		System.out.println("[" + currentThreadName + "] main thread starts here ...");

		ExecutorService executorService = Executors.newCachedThreadPool(new NamedThreadFactory());
		Future<Integer> result1 = executorService.submit(new CalculationTaskA(2, 3, 2000));
		Future<Integer> result2 = executorService.submit(new CalculationTaskA(8, 3, 1000));
		Future<Integer> result3 = executorService.submit(new CalculationTaskA(5, 3, 500));

		Future<?> result4 = executorService.submit(new LoopTaskA());
		Future<?> result5 = executorService.submit(new LoopTaskA(), 999.88);

		executorService.shutdown();
		
		try {
			System.out.println("Result-1 = " + result1.get());
			System.out.println("Result-2 = " + result2.get());
			System.out.println("Result-3 = " + result3.get());
			System.out.println("Result-4 = " + result4.get());
			System.out.println("Result-5 = " + result5.get());
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("[" + currentThreadName + "] main thread ends here ...");

	}
}
