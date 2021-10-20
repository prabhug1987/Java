package tuts.common;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class LoopTaskH implements Runnable {
	private static int count = 0;
	private int id;
	private String taskId;

	private final int DATA_SIZE = 10000;

	private boolean sleepInterrupted = false;
	
	@Override
	public void run() {

		System.out.println("###### [" + Thread.currentThread().getName() + "] <" + taskId + "> Starting #####");
		for (int i = 1;; i++) {
			System.out.println("[" + Thread.currentThread().getName() + "] <" + taskId + "> Tick tick ");
			try {
				TimeUnit.MILLISECONDS.sleep((long)Math.random()* 1000);
			} catch (InterruptedException e) {
				// TODO: handle exception
				System.out.println("***** [" + Thread.currentThread().getName() + "] <" + taskId + "> sleep interrupted.... setting the flag... ");
				
				sleepInterrupted = true;
			}
			
			doSomething();
			
			if(sleepInterrupted || Thread.interrupted()) {
				System.out.println("***** [" + Thread.currentThread().getName() + "] <" + taskId + "> INTTERUPTED. cancelling...");
				break;
			}
		}
		
		System.out.println("##### [" + Thread.currentThread().getName() + "] < " + taskId + " doing some work ****** ");
	}
	
	private void doSomething() {
		System.out.println("##### [" + Thread.currentThread().getName() + "] < " + taskId + " done ****** ");
	}

	public LoopTaskH() {
		// TODO Auto-generated constructor stub
		this.id = ++count;
		this.taskId = "LoopTaskH " + id;
	}
}
