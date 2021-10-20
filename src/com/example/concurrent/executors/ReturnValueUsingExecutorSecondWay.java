package com.example.concurrent.executors;

import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import tuts.common.LoopTaskA;

public class ReturnValueUsingExecutorSecondWay {

	public static void main(String[] args) {
		String currentThreadName = Thread.currentThread().getName();

		System.out.println("[" + currentThreadName + "] main thread starts here ...");

		
		
		ExecutorService executorService = Executors.newCachedThreadPool(new NamedThreadFactory());
		CompletionService<TaskResult<String,Integer>> tasks = new ExecutorCompletionService<TaskResult<String,Integer>>(executorService);
		tasks.submit(new CalculationTaskB(2, 3, 2000));
		tasks.submit(new CalculationTaskB(8, 3, 1000));
		tasks.submit(new CalculationTaskB(5, 3, 500));

		
		
		//Future<?> result4 = executorService.submit(new LoopTaskA());
		tasks.submit(new LoopTaskA(), new TaskResult<String, Integer>("Loop task - 1", 999));
		
		executorService.shutdown();
		
		for (int i = 0; i < 4; i++) {
			try {
				System.out.println( tasks.take().get());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("[" + currentThreadName + "] main thread ends here ...");

	}

}
