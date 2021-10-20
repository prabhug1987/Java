package com.example.concurrent.executors;

import java.util.concurrent.TimeUnit;

public class ValueReturningTask implements Runnable {

	private int a;
	private int b;
	private long sleepTime;
	private int sum;

	private static int count = 0;
	private int instanceNumber;
	private String taskId;
	
	private boolean isDone = false;

	public ValueReturningTask(int a, int b, long sleepTime) {
		// TODO Auto-generated constructor stub
		this.a = a;
		this.b = b;
		this.sleepTime = sleepTime;
		this.instanceNumber = ++count;
		this.taskId = "value Return " + instanceNumber;
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
		
		isDone = true;
		
		synchronized(this){
			System.out.println("["+Thread.currentThread().getName()+"] <"+ taskId + "> NOTIFYING ....");
			this.notifyAll();
		}

	}
	
	public int getSum() {
		
		if(!isDone) {
			synchronized (this) {
				
				try {
					
					System.out.println("["+Thread.currentThread().getName()+"] ==== WAITING FOR Result from "+taskId +"....");
					this.wait();
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
				
			}
			
			System.out.println("["+Thread.currentThread().getName()+" ] ==== WOKEN UP FOR "+ taskId +"....");
		}
		return sum;
	}

}
