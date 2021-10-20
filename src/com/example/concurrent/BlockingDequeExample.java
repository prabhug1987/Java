package com.example.concurrent;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;

public class BlockingDequeExample {

	public static void main(String[] args) throws InterruptedException {
		BlockingDeque<String> queue = new LinkedBlockingDeque<String>();

		queue.addFirst("1");
		queue.addLast("2");
		
		String str = queue.takeFirst();
		String str1 = queue.takeLast();

	}
}
