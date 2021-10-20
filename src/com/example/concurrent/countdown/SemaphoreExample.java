package com.example.concurrent.countdown;

public class SemaphoreExample {

	public static void main(String[] args) {
		Semaphore semaphore = new Semaphore();
		
		SendingThread sendingThread = new SendingThread(semaphore);
		ReceivingThread receivingThread = new ReceivingThread(semaphore);
		new Thread(sendingThread).start();
		new Thread(receivingThread).start();
		
		
	}
}
