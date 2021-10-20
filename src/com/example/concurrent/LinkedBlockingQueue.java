package com.example.concurrent;

import java.util.concurrent.BlockingQueue;

public class LinkedBlockingQueue {

	public static void main(String[] args) throws InterruptedException {
		BlockingQueue<String> unbounded = new java.util.concurrent.LinkedBlockingQueue<String>();
		BlockingQueue<String> bounded = new java.util.concurrent.LinkedBlockingQueue<String>();
		
		bounded.put("value");
		String value = bounded.take();
	}
}
