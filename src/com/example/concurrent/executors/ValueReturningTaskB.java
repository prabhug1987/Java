package com.example.concurrent.executors;

import java.util.concurrent.TimeUnit;

public class ValueReturningTaskB implements Runnable {

	private int a;
	private int b;
	private long sleepTime;
	private int sum;

	private static int count = 0;
	private int instanceNumber;
	private String taskId;
	private ResultListner<Integer> resultListner;
	
	public ValueReturningTaskB(int a, int b, long sleepTime, ResultListner<Integer> resultListner)  {
		// TODO Auto-generated constructor stub
		this.a = a;
		this.b = b;
		this.sleepTime = sleepTime;
		this.instanceNumber = ++count;
		this.taskId = "ValueReturningTaskB 	" + instanceNumber;
		this.resultListner = resultListner;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		String currentThreadName = Thread.currentThread().getName();
		System.out.println("###### [ " + currentThreadName + "] <" + taskId + "> STARTING ########");
		try {
			TimeUnit.MILLISECONDS.sleep(sleepTime);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		sum = a + b;
		
		System.out.println("****** ["+ currentThreadName + "] < " +taskId +"> DONE ******");
		resultListner.notifyResult(sum);

	}

}
