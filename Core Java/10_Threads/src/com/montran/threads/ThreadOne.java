package com.montran.threads;

//ThreadOne "is a" Thread
public class ThreadOne extends Thread {

	public void run() {
		System.out.println("We are in thread One.");
		for (int i = 0; i < 10; i++) {
			System.out.println("ThreadOne " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
