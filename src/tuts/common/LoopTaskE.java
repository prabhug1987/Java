package tuts.common;

import java.util.concurrent.TimeUnit;

public class LoopTaskE implements Runnable {
	private static int count = 0;
	private int id;
	private String taskId;

	private volatile boolean shutdown = false;

	@Override
	public void run() {

		// String currentThreadName = Thread.currentThread().getName();

		boolean isRunningInDeamonThread = Thread.currentThread().isDaemon();
		String threadType = isRunningInDeamonThread ? "DEAMON" : "USER";

		// TODO Auto-generated method stub
		System.out.println("###### [" + Thread.currentThread().getName() + ", " + threadType + "] <" + taskId
				+ "> Starting #####");
		for (int i = 0; i < 10; i++) {
			System.out.println(
					"[" + Thread.currentThread().getName() + "," + threadType + "] <" + taskId + "> Tick tick " + i);
			try {
				TimeUnit.MILLISECONDS.sleep(100);
			} catch (Exception e) {
				// TODO: handle exception
			}
			synchronized (this) {
				if (shutdown) {
					break;
				}
			}
		}

		System.out.println("##### [" + Thread.currentThread().getName() + "] < " + taskId + " done ****** ");
	}

	public void cancel() {
		System.out
				.println("****** [ " + Thread.currentThread().getName() + " ] < " + taskId + " > shutting down ******");
		synchronized (this) {
			this.shutdown = true;
		}

	}

	public LoopTaskE() {
		// TODO Auto-generated constructor stub
		this.id = ++count;
		this.taskId = "LoopTaskC " + id;

	}

}
