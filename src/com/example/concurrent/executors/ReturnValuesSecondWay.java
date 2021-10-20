package com.example.concurrent.executors;

public class ReturnValuesSecondWay {

	public static void main(String[] args) {
		String currentThreadName = Thread.currentThread().getName();
		
		System.out.println("["+ currentThreadName +"] main thread starts here ...");
		ValueReturningTaskB task1 = new ValueReturningTaskB(2, 3, 2000, new SumObserver("task-1"));
		
		Thread thread = new Thread(task1, "Thread - 1");
		ValueReturningTaskB task2 = new ValueReturningTaskB(2, 4, 1000,new SumObserver("task-2"));
		Thread thread2 = new Thread(task2, "Thread - 2");
		
		ValueReturningTaskB task3 = new ValueReturningTaskB(3, 5, 500,new SumObserver("task-3"));
		Thread thread3 = new Thread(task3, "Thread - 3");	
		
		
		thread.start();
		thread2.start();
		thread3.start();
		
		System.out.println("["+ currentThreadName +"] main thread ends here ...");
			
		
	}
}
