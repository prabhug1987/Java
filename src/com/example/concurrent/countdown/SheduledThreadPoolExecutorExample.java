package com.example.concurrent.countdown;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class SheduledThreadPoolExecutorExample {

	public static void main(String[] args) {
		ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(5);

		ScheduledFuture scheduledFuture = scheduledExecutorService.schedule(new Callable() {
			@Override
			public Object call() throws Exception {
				// TODO Auto-generated method stub
				System.out.println("Executed!");
				return "called";

			}
		}, 5, TimeUnit.MILLISECONDS);

		try {
			System.out.println("result is " + scheduledFuture.get());
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		scheduledExecutorService.shutdown();

	}
}
