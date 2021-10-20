package com.example.concurrent;

public class SynchronizedExample {

	int count = 0;

	static int count1 = 0;

	public void add(int value) {
		synchronized (this) {
			this.count += value;
		}
	}

	public synchronized static void set(int value) {
		count1 += value;
	}

	public static void setValue(int value) {
		synchronized (SynchronizedExample.class) {
			count1 += value;
		}
	}

}
