package com.example.concurrent.countdown;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceExample {

	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(10);

		executorService.execute(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Asynchronous task");
			}
		});
		executorService.shutdown();
		
		Future future = executorService.submit(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Asynchronous task");
			}
		});
		
		try {
			System.out.println(future.get());
		} catch (InterruptedException | ExecutionException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		
		Future future1 = executorService.submit(new Callable() {

			@Override
			public Object call() throws Exception{
				// TODO Auto-generated method stub
				return "Callable result";
			}
		});
		
		try {
			System.out.println("future.get() = " + future1.get());
		} catch (InterruptedException | ExecutionException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		
		

	}
}
