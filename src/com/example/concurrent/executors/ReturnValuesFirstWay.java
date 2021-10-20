package com.example.concurrent.executors;

public class ReturnValuesFirstWay {

	public static void main(String[] args) {
		String currentThreadName = Thread.currentThread().getName();
		
		System.out.println("["+ currentThreadName +"] main thread starts here ...");
		ValueReturningTask task1 = new ValueReturningTask(2, 3, 200);
		
		Thread thread = new Thread(task1, "Thread - 1");
		ValueReturningTask task2 = new ValueReturningTask(2, 4, 1000);
		Thread thread2 = new Thread(task2, "Thread - 2");
		
		ValueReturningTask task3 = new ValueReturningTask(3, 5, 500);
		Thread thread3 = new Thread(task3, "Thread - 3");	
		
		System.out.println("["+ currentThreadName +"] main thread ends here ...");
		
		thread.start();
		thread2.start();
		thread3.start();
		
		System.out.println("Result - 1 "+ task1.getSum());
		System.out.println("Result - 2 "+ task2.getSum());
		System.out.println("Result - 3 "+ task3.getSum());
		
		
	}
}
