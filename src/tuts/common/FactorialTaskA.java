package tuts.common;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public class FactorialTaskA implements Callable<Long> {
	private int id;
	private long a;
	private static int count = 0;
	private String taskId;
    private long sleepTime;
    private long factorial;
	private volatile boolean shutdown = false;

	@Override
	public Long call() throws Exception {

		// String currentThreadName = Thread.currentThread().getName();

		boolean isRunningInDeamonThread = Thread.currentThread().isDaemon();
		String threadType = isRunningInDeamonThread ? "DEAMON" : "USER";

		factorial = 1L;
		// TODO Auto-generated method stub
		System.out.println("###### [" + Thread.currentThread().getName() + ", " + threadType + "] <" + taskId
				+ "> Starting #####");
		for (int i = 0; i < 10; i++) {
			factorial *= i;
			System.out.println(
					"[" + Thread.currentThread().getName() + "," + threadType + "] <" + taskId + "> Iteration -  " + i+ ". Intermediate Result = "+ factorial);
			try {
				TimeUnit.MILLISECONDS.sleep(100);
			} catch (Exception e) {
				// TODO: handle exception
			}
			synchronized (this) {
				if (shutdown) {
					factorial = -1L;
					break;
				}
			}
		}

		System.out.println("##### [" + Thread.currentThread().getName() + "] < " + taskId + " done ****** ");
		
		return factorial;
	}

	public void cancel() {
		System.out
				.println("****** [ " + Thread.currentThread().getName() + " ] < " + taskId + " > shutting down ******");
		synchronized (this) {
			this.shutdown = true;
		}

	}

	public FactorialTaskA(long a, long sleepTime) {
		// TODO Auto-generated constructor stub
		this.id = ++count;
		this.a = a;
		this.sleepTime = sleepTime;
		this.taskId = "LoopTaskC " + id;

	}

}
