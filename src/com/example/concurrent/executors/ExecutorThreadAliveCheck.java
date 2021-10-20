package com.example.concurrent.executors;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

import tuts.common.LoopTaskC;

public class ExecutorThreadAliveCheck {
	public static void main(String[] args) {
		
		String currentThreadName = Thread.currentThread().getName();
		
		System.out.println("["+ currentThreadName +"] main thread starts here ...");
		
		 ExecutorService executorService = Executors.newCachedThreadPool(new NamedThreadFactory());

		Future<?> f1 = executorService.submit(new LoopTaskC());
		Future<Integer> f2 = executorService.submit(new CalculationTaskA(4, 6, 200));
		
		FutureTask<?> f3 =  new FutureTask<Void>(new LoopTaskC(),null);
		FutureTask<Integer> f4 =  new FutureTask<Integer>(new LoopTaskC(), 999);
		FutureTask<Integer> f5 =  new FutureTask<Integer>(new CalculationTaskA(4, 5, 500));
		
		executorService.execute(f3);
		executorService.execute(f4);
		executorService.execute(f5);
		executorService.shutdown();
		
		for (int i = 1; i <= 5 ; i++) {
			try {
				TimeUnit.MICROSECONDS.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("["+currentThreadName +" ] - "+i+ "-> Is LoopTaskC - 1  done" + f1.isDone());
			System.out.println("["+currentThreadName +"] - "+i+ "-> Is LoopTaskC - 2  done" + f2.isDone());
			System.out.println("["+currentThreadName +" ] - "+i+ "-> Is LoopTaskC - 3  done" + f3.isDone());
			System.out.println("["+currentThreadName +"] - "+i+ "-> Is LoopTaskC - 4  done" + f4.isDone());
			System.out.println("["+currentThreadName +"] - "+i+ "-> Is LoopTaskC - 5  done" + f5.isDone());
		}
		
		System.out.println("\n $$$$$ [ "+ currentThreadName +"] Retriving the results now ....$$$$$");
		try {
			System.out.println("["+currentThreadName +" ] Is LoopTaskC - 1 result = "+ f1.get());
			System.out.println("["+currentThreadName +" ] Is LoopTaskC - 2 result = "+ f2.get());
			System.out.println("["+currentThreadName +" ] Is LoopTaskC - 3 result = "+ f3.get());
			System.out.println("["+currentThreadName +" ] Is LoopTaskC - 4 result = "+ f4.get());
			System.out.println("["+currentThreadName +" ] Is LoopTaskC - 5 result = "+ f5.get());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
				
		System.out.println("["+ currentThreadName +"] main thread ends here ...");
		
	}
}
