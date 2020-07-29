package com.montran.main;

import com.montran.threads.ThreadTwo;

public class ThreadTwoMain {
	// Main thread
	public static void main(String[] args) {

		Thread threadMain = Thread.currentThread();
		System.out.println(threadMain);

		ThreadTwo target = new ThreadTwo();

		// Child Thread
		Thread thread = new Thread(target);
		thread.start();
	}
}
