package tuts.common;

import java.util.concurrent.TimeUnit;

public class LoopTaskD implements Runnable {

	private static int count = 0;
	private int id;
	private String taskId;
	private long sleepTime;

	@Override
	public void run() {
		
		//String currentThreadName = Thread.currentThread().getName();
		
		boolean isRunningInDeamonThread = Thread.currentThread().isDaemon();
		String threadType = isRunningInDeamonThread ? "DEAMON": "USER";	
		
		// TODO Auto-generated method stub
		System.out.println("###### ["+Thread.currentThread().getName()	+", "+threadType+"] <" + taskId + "> Starting #####");
		for (int i = 0; i < 10; i++) {
			System.out.println("[" +Thread.currentThread().getName()+","+threadType+"] <"+ taskId + "> Tick tick " + i);
		}
		
		for (int i = 0; i < 10; i++) {
			try {
				TimeUnit.MILLISECONDS.sleep(sleepTime);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}

		
		
		System.out.println("##### ["+ Thread.currentThread().getName() +"] < " +taskId+" done ****** ");
	}

	public LoopTaskD(long sleepTime) {
		// TODO Auto-generated constructor stub
		this.id = ++count;
		this.taskId = "LoopTaskC "+ id;
		this.sleepTime = sleepTime;
	}

}
