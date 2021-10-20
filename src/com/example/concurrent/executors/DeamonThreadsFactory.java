package com.example.concurrent.executors;

public class DeamonThreadsFactory extends NamedThreadFactory {

	private static int count = 0;

	@Override
	public Thread newThread(Runnable r) {
		// TODO Auto-generated method stub
		Thread t = super.newThread(r);

		count++;

		if (count % 2 == 0) {
			t.setDaemon(true);
		}

		return t;
	}

}
