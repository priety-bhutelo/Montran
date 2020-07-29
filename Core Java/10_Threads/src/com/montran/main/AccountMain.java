package com.montran.main;

import com.montran.pojo.Account;
import com.montran.threads.DepositThread;
import com.montran.threads.WithdrawThread;

public class AccountMain {
	public static void main(String[] args) {
		Account account = new Account();

		Thread withdrawThread = new Thread(new WithdrawThread(account, 1500));
		Thread depositThread = new Thread(new DepositThread(account, 1000));

		withdrawThread.start();
		depositThread.start();
	}
}
