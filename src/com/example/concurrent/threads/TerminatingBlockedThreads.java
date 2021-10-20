package com.example.concurrent.threads;

import java.util.concurrent.TimeUnit;

import tuts.common.LoopTaskF;
import tuts.common.LoopTaskH;

public class TerminatingBlockedThreads {

	public static void main(String[] args) {
		String currentThreadName = Thread.currentThread().getName();
		System.out.println("[" + currentThreadName + "] main thread starts here");

		LoopTaskF loopTaskE1 = new LoopTaskF();
		LoopTaskF loopTaskE2 = new LoopTaskF();
		LoopTaskF loopTaskE3 = new LoopTaskF();
		
		LoopTaskH loopTaskH1 = new LoopTaskH();
		LoopTaskH loopTaskH2 = new LoopTaskH();
		
		Thread t1 = new Thread(loopTaskE1, "MyThread - 1");
		t1.start();
		Thread t2 = new Thread(loopTaskE2, "MyThread - 2");
		t2.start();
		Thread t3 = new Thread(loopTaskE3, "MyThread - 3");
		t3.start();
		
		Thread t4 = new Thread(loopTaskH1, "MyThread - 4");
		t4.start();
		Thread t5 = new Thread(loopTaskH2, "MyThread - 5");
		t5.start();
		
		try {
			TimeUnit.MILLISECONDS.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("[" + Thread.currentThread().getName() + "] Interrupting "+ t1.getName() + "......" );

		t1.interrupt();

		System.out.println("[" + Thread.currentThread().getName() + "] Interrupting "+ t2.getName() + "......" );

		t2.interrupt();

		System.out.println("[" + Thread.currentThread().getName() + "] Interrupting "+ t3.getName() + "......" );

		t3.interrupt();

		
		System.out.println("[" + Thread.currentThread().getName() + "] Interrupting "+ t4.getName() + "......" );
		t4.interrupt();
		
		System.out.println("[" + Thread.currentThread().getName() + "] Interrupting "+ t5.getName() + "......" );
		t5.interrupt();

		System.out.println("[" + currentThreadName + "] main thread starts here");

	}
}
