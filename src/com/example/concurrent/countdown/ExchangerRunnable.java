package com.example.concurrent.countdown;

import java.util.concurrent.Exchanger;

public class ExchangerRunnable implements Runnable {

	Exchanger exchanger;
	Object object;

	public ExchangerRunnable(Exchanger exchanger, Object object) {
		// TODO Auto-generated constructor stub
		this.exchanger = exchanger;
		this.object = object;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			Object previous = this.object;
			this.object = this.exchanger.exchange(this.object);

			System.out.println(Thread.currentThread().getName() + " exchanged " + previous + " for " + this.object);

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
