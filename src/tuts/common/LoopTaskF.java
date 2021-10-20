package tuts.common;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class LoopTaskF implements Runnable {
	private static int count = 0;
	private int id;
	private String taskId;

	private final int DATA_SIZE = 10000;

	@Override
	public void run() {

		System.out.println("###### [" + Thread.currentThread().getName() + "] <" + taskId + "> Starting #####");
		for (int i = 1;; i++) {
			System.out.println("[" + Thread.currentThread().getName() + "] <" + taskId + "> Tick tick ");
			doSomeWork();

			if (Thread.interrupted()) {
				System.out.println(
						"[" + Thread.currentThread().getName() + "] <" + taskId + "> Interrupted. cancelling ....");
				break;
			}
		}

		System.out.println("[" + Thread.currentThread().getName() + "] <" + taskId
				+ "> retrieving Interrupted. status again : " + Thread.interrupted());

		System.out.println("##### [" + Thread.currentThread().getName() + "] < " + taskId + " done ****** ");
	}

	public LoopTaskF() {
		// TODO Auto-generated constructor stub
		this.id = ++count;
		this.taskId = "LoopTaskC " + id;

	}

	private void doSomeWork() {
		for (int i = 0; i < 2; i++) {
			Collections.sort(generateDataSet());
		}
	}

	private List generateDataSet() {
		// TODO Auto-generated method stub
		List<Integer> inList = new ArrayList<Integer>();
		Random randomGenerator = new Random();

		for (int i = 0; i < DATA_SIZE; i++) {
			inList.add(randomGenerator.nextInt(DATA_SIZE));
		}
		return inList;
	}

}
