package com.example.collection;

import java.util.HashMap;
import java.util.Map;

public class IterateAndModifyHashMap extends Thread {

	// creating HashMap object of type <Integer, String>
	static Map<Integer, String> hm = new HashMap<Integer, String>();

	@Override
	public void run() {

		try {
			// sleeping thread for 1000 ms
			Thread.sleep(1000);

			// removing entry with key=1
			String value = hm.remove(1);
			System.out.println("Entry with {key=1" + " & value=" + value + "} is removed");
		} catch (InterruptedException iex) {
			iex.printStackTrace();
		}
		System.out.println("Removal is done... !!");
	}

	/**
	 * main() method
	 * 
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {

		// adding key-value pairs to HashMap object
		hm.put(1, "value1");
		hm.put(2, "value2");
		hm.put(3, "value3");

		// creating another thread
		Thread newThread = new Thread(new IterateAndModifyHashMap());
		newThread.start();

		// iterating HM object using enhanced for-loop
		for (Map.Entry<Integer, String> me : hm.entrySet()) {

			System.out.println("{Key=" + me.getKey() + "\t" + "Value=" + me.getValue() + "}");

			// sleeping thread for 1500 ms, after every turn
			Thread.sleep(1500);
		}
		System.out.println("Iterating completed... !!");
	}
}