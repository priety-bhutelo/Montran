package com.montran.main;

import com.montran.threads.ThreadOne;
import com.montran.threads.ThreadTwo;

public class ThreadRnD {
	public static void main(String[] args) {
		System.out.println("main start");

		System.out.println("main is starting threadOne");
		ThreadOne one = new ThreadOne();
		one.start();
		
		try {
			//will wait until threadOne dont get finished
			one.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("----------------------------------------");

		System.out.println("main is starting thredTwo");
		Thread thread = new Thread(new ThreadTwo());
		thread.start();

		try {
			thread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("main end");
	}
}
