package com.montran.main;

import com.montran.resource.Call;
import com.montran.threads.Caller;

public class CallerMain {
	public static void main(String[] args) {
		// "Hi" , "Hello" , "How are you"
		try {
			Call call = new Call();

			Caller caller1 = new Caller("Hi", call);
			Thread thread1 = new Thread(caller1);

			Caller caller2 = new Caller("Hello", call);
			Thread thread2 = new Thread(caller2);

			Caller caller3 = new Caller("How are you", call);
			Thread thread3 = new Thread(caller3);

			thread1.start();
			thread2.start();
			thread3.start();

		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
