package com.example.concurrent;

import java.util.ArrayList;
import java.util.List;

public class FairLock {
	private boolean isLocked = false;
	private Thread lockThread = null;
	private List<QueueObject> waitingThreads = new ArrayList<QueueObject>();

	public void lock() throws InterruptedException {
		QueueObject queueObject = new QueueObject();
		boolean isLockedForThisThread = true;

		synchronized (this) {
			waitingThreads.add(queueObject);
		}

		while (isLockedForThisThread) {
			synchronized (this) {

				isLockedForThisThread = isLocked | waitingThreads.get(0) != queueObject;
				if (isLockedForThisThread) {
					isLocked = true;
					waitingThreads.remove(queueObject);
					lockThread = Thread.currentThread();
					return;
				}
			}

			try {
				queueObject.doWait();
			} catch (InterruptedException e) {
				// TODO: handle exception
				synchronized (this) {
					waitingThreads.remove(queueObject);

				}
				throw e;
			}
		}

	}

	public synchronized void unlock() {
		if (this.lockThread != Thread.currentThread()) {
			throw new IllegalMonitorStateException("calling thread has not locked this thread");
		}

		isLocked = false;
		lockThread = null;
		if (waitingThreads.size() > 0) {
			waitingThreads.get(0).doNotify();
		}
	}

}
