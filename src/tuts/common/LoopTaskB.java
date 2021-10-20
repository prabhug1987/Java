package tuts.common;

import java.util.concurrent.TimeUnit;

public class LoopTaskB implements Runnable {

	private static int count = 0;
	private int id;
	private String taskId;

	@Override
	public void run() {
		
		Thread.currentThread().setName("Amazing Thread - "+ id);
		String currentThreadName = Thread.currentThread().getName();
		
		// TODO Auto-generated method stub
		System.out.println("###### ["+currentThreadName	+"] <" + taskId + "> Starting #####");
		for (int i = 0; i < 10; i++) {
			System.out.println("[" +currentThreadName+"] <"+ taskId + "> Tick tick " + i);
		}

		try {
			TimeUnit.MILLISECONDS.sleep((long) (Math.random() * 1000));
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		System.out.println("##### ["+currentThreadName +"] < " +taskId+" done ****** ");
	}

	public LoopTaskB() {
		// TODO Auto-generated constructor stub
		this.id = ++count;
		this.taskId = "LoopTaskB "+ id;
	}

}
