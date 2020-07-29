package com.montran.resource;

//resource
public class Call {
	// monitor lock
	public synchronized void printMessage(String message) {
		try {
			System.out.print("[");
			Thread.sleep(1000);

			System.out.print(message);
			Thread.sleep(1000);

			System.out.println("]");
			Thread.sleep(1000);

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
