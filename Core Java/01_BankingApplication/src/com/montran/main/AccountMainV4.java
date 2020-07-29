package com.montran.main;

import com.montran.pojo.Account;
import com.montran.pojo.Savings;

public class AccountMainV4 {

	public static void main(String[] args) {

		// calling default constructor
		// Account account = new Account();

//		Account account = new Account(101, "Vivek", 1000);
//		System.out.println(account);

		// base class -> derived class
		// Savings savings = new Savings();

		// Savings savings = new Savings(true); 500
		Savings savings = new Savings(101, "Vivek Gohil", 1000, false);

	}

}
