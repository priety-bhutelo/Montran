package com.montran.threads;

import com.montran.pojo.Account;

public class DepositThread implements Runnable {
	private Account account;
	private double amount;

	public DepositThread(Account account, double amount) {
		this.account = account;
		this.amount = amount;
	}

	@Override
	public void run() {
		account.deposit(amount);
	}
}
