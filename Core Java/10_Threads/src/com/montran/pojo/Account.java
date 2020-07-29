package com.montran.pojo;

public class Account {
	private double balance = 1000;

	public synchronized void withdraw(double amount) {
		System.out.println("Withdraw :: " + amount);
		System.out.println("Balance :: " + balance);
		if (amount > balance) {
			try {
				System.out.println("Waiting for deposit");
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		balance = balance - amount;
		System.out.println("Withdraw Success");
	}

	public synchronized void deposit(double amount) {
		System.out.println("Deposit :: " + amount);
		balance = balance + amount;
		System.out.println("Deposit Success");
		System.out.println("Calling notify");
		notify();
	}
}
