package com.example.concurrent.countdown;

public class CountingSemaphore {
	private int signals = 0;

	public synchronized void take() {
		this.signals++;
		this.notify();
	}

	public synchronized void release() throws InterruptedException {
		while (signals == 0)
			wait();
		this.signals--;
	}

}
