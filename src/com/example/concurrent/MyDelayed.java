package com.example.concurrent;

import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

public class MyDelayed implements Delayed {
    String data;
	long startTime;

	public MyDelayed(String data, long delayInMilliSeconds) {
		// TODO Auto-generated constructor stub
		this.data = data;
		this.startTime = delayInMilliSeconds;

	}

	@Override
	public int compareTo(Delayed delayed) {
		// TODO Auto-generated method stub
		
		return 0;
	}

	@Override
	public long getDelay(TimeUnit unit) {
		// TODO Auto-generated method stub
		long diff = startTime - System.currentTimeMillis();
		return unit.convert(diff, TimeUnit.MILLISECONDS);
	}

}
