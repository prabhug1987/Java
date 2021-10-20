package tuts.common;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;

public class CalculationTaskC implements Callable<Long> {
	private static int count = 0;
	private int id;
	private String taskId;
	private  boolean isThreadInterrupted = false;
	private final int DATA_SIZE = 10000;

	@Override
	public Long call() throws Exception {

		System.out.println("###### [" + Thread.currentThread().getName() + "] <" + taskId + "> Starting #####");
		long totalTimeTakenInMilliSeconds = 0;
		for (int i = 1; i < 1000; i++) {
			System.out.println("[" + Thread.currentThread().getName() + "] <" + taskId + "> current running average = "+(i==0? 0: totalTimeTakenInMilliSeconds/( 2 * i )));
			long timeTakenInMilliSeconds =  doSomeWork();

			totalTimeTakenInMilliSeconds += timeTakenInMilliSeconds; 
					
			if (Thread.interrupted()) {
				System.out.println(
						"[" + Thread.currentThread().getName() + "] <" + taskId + "> Interrupted. cancelling ....");
				isThreadInterrupted = true;
				break;
			}
		}

		System.out.println("[" + Thread.currentThread().getName() + "] <" + taskId
				+ "> retrieving Interrupted. status again : " + Thread.interrupted());

		System.out.println("##### [" + Thread.currentThread().getName() + "] < " + taskId + " done ****** ");
		
		return isThreadInterrupted ? -1: totalTimeTakenInMilliSeconds / (2* 1000);
	}

	public CalculationTaskC() {
		// TODO Auto-generated constructor stub
		this.id = ++count;
		this.taskId = "CalculationTaskC " + id;

	}

	private long doSomeWork() {
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < 2; i++) {
			Collections.sort(generateDataSet());
		}
		
		return System.currentTimeMillis() - startTime;
	}

	private List generateDataSet() {
		// TODO Auto-generated method stub
		List<Integer> inList = new ArrayList<Integer>();
		Random randomGenerator = new Random();

		for (int i = 0; i < DATA_SIZE; i++) {
			inList.add(randomGenerator.nextInt(DATA_SIZE));
		}
		return inList;
	}

}
