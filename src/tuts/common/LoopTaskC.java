package tuts.common;

import java.util.concurrent.TimeUnit;

public class LoopTaskC implements Runnable {

	private static int count = 0;
	private int id;
	private String taskId;

	@Override
	public void run() {
		
		//String currentThreadName = Thread.currentThread().getName();
		
		// TODO Auto-generated method stub
		System.out.println("###### ["+Thread.currentThread().getName()	+"] <" + taskId + "> Starting #####");
		for (int i = 0; i < 10; i++) {
			System.out.println("[" +Thread.currentThread().getName()+"] <"+ taskId + "> Tick tick " + i);
		}

		try {
			TimeUnit.MILLISECONDS.sleep((long) (Math.random() * 1000));
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		System.out.println("##### ["+ Thread.currentThread().getName() +"] < " +taskId+" done ****** ");
	}

	public LoopTaskC() {
		// TODO Auto-generated constructor stub
		this.id = ++count;
		this.taskId = "LoopTaskC "+ id;
	}

}
