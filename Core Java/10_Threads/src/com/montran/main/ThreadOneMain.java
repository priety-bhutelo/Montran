package com.montran.main;

import com.montran.threads.ThreadOne;

public class ThreadOneMain {
	public static void main(String[] args) {
		
		ThreadOne one = new ThreadOne();
		one.start();
	}
}
