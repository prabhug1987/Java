package com.example.concurrent.countdown;

public class ReceivingThread implements Runnable{

	Semaphore semaphore;
	public ReceivingThread(Semaphore semaphore) {
		// TODO Auto-generated constructor stub
		this.semaphore = semaphore;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
	
		while(true) {
			try {
				this.semaphore.release();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
}
