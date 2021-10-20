package com.example.concurrent.threads;

import java.util.concurrent.TimeUnit;

import tuts.common.LoopTaskE;

public class TerminatingThreadFirstWay {

	public static void main(String[] args) {
		String currentThreadName = Thread.currentThread().getName();
		System.out.println("[" + currentThreadName + "] main thread starts here");

		LoopTaskE loopTaskE1 = new LoopTaskE();
		LoopTaskE loopTaskE2 = new LoopTaskE();
		LoopTaskE loopTaskE3 = new LoopTaskE();

		new Thread(loopTaskE1, "MyThread - 1").start();
		new Thread(loopTaskE1, "MyThread - 2").start();
		new Thread(loopTaskE1, "MyThread - 3").start();

		try {
			TimeUnit.MILLISECONDS.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		loopTaskE1.cancel();
		loopTaskE2.cancel();
		loopTaskE3.cancel();

		System.out.println("[" + currentThreadName + "] main thread starts here");

	}
}
