package com.example.concurrent.countdown;

public class SendingThread implements Runnable{

	Semaphore semaphore;
	public SendingThread(Semaphore semaphore) {
		// TODO Auto-generated constructor stub
		this.semaphore = semaphore;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
	
		while(true) {
			this.semaphore.take();
		}
	}
	
	
}
