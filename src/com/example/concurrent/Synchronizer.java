package com.example.concurrent;

public class Synchronizer {

	
	public static void main(String[] args) {
		Lock lock = new Lock();	
		lock.lock();
		
	    lock.unlock();
	}
}
