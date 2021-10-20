package com.example.concurrent.threads;

import java.util.concurrent.TimeUnit;

public class FifthWay {

	public static void main(String[] args) {
		Thread t = new Thread(new Runnable() {
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println(" Tick tick " + i);
				}
				
				try {
					TimeUnit.MILLISECONDS.sleep(100);
				} catch (Exception e) {
					// TODO: handle exception
				}	
			}
		});
		
		t.start();;
		
	}
}
