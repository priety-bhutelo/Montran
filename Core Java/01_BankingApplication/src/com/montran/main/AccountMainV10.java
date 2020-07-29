package com.montran.main;

import com.montran.pojo.Account;
import com.montran.pojo.Current;
import com.montran.pojo.Savings;

public class AccountMainV10 {
	public static void main(String[] args) {
		Account account = new Savings(0, "Vivek", 1000, true);
		Account account2 = new Current(0, "Abhishek", 1000, 10000);
		Account account3 = new Savings(0, "Shrinika", 10000, false);

		System.out.println(account); // accountNumber = 101
		System.out.println(account2); // accountNumber = 102
		System.out.println(account3); // accountNumber = 103
	}
}
