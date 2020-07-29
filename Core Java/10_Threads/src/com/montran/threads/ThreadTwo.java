package com.montran.threads;

public class ThreadTwo implements Runnable {

	public void run() {
		System.out.println("We are in ThreadTwo !!");
		for (int i = 0; i < 10; i++) {
			System.out.println("ThreadTwo " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
