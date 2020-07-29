package com.montran.threads;

import com.montran.resource.Call;

//caller is using resource
public class Caller implements Runnable {

	private String message;
	private Call call;

	public Caller(String message, Call call) {
		this.message = message;
		this.call = call;
	}

	public void run() {
		call.printMessage(message);
	}
}
