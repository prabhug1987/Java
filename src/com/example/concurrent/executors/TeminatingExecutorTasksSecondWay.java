package com.example.concurrent.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

import tuts.common.CalculationTaskC;
import tuts.common.FactorialTaskA;
import tuts.common.LoopTaskF;

public class TeminatingExecutorTasksSecondWay {

	public static void main(String[] args) throws InterruptedException {
		String currentThreadName = Thread.currentThread().getName();
		System.out.println("[" + currentThreadName + "] main thread starts here ...");
		
		ExecutorService executorService = Executors.newCachedThreadPool(new NamedThreadFactory());
		
		LoopTaskF loopTaskF = new LoopTaskF();
		LoopTaskF loopTaskF1 = new LoopTaskF();
		
		CalculationTaskC calculationTaskC = new CalculationTaskC();
		CalculationTaskC calculationTaskC1 = new CalculationTaskC();
		Future<Long> result = executorService.submit(calculationTaskC);
		Future<Long> result3 = executorService.submit(calculationTaskC1);
		
		Future<?> result1 = executorService.submit(loopTaskF);  
		Future<?> result2 = executorService.submit(loopTaskF1);  
		
		executorService.shutdown();
		
		TimeUnit.MILLISECONDS.sleep(2000);
								
		System.out.println("[" + currentThreadName + "] INTERRUPTING CALCULATION task C ...");
		result.cancel(true);
		
		System.out.println("[" + currentThreadName + "] INTERRUPTING Loop F1 ...");
		result1.cancel(true);
		
		System.out.println("[" + currentThreadName + "] INTERRUPTING Loop F2 ...");
		result2.cancel(true);
		
		System.out.println("[" + currentThreadName + "] main thread ends here ...");
	}
}
