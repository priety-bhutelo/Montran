package com.montran.threads;

import com.montran.pojo.Account;

public class WithdrawThread implements Runnable {
	private Account account;
	private double amount;

	public WithdrawThread(Account account, double amount) {
		this.account = account;
		this.amount = amount;
	}

	@Override
	public void run() {
		account.withdraw(amount);
	}

}
