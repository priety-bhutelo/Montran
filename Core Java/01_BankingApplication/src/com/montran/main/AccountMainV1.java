package com.montran.main;

import com.montran.pojo.Account;

public class AccountMainV1 {

	public static void main(String[] args) {
		// Account account = new Account();

		Account account; // reference :: Stack

		account = new Account(); // object :: Heap

		System.out.println(account.hashCode());

		//account.withdraw();
		//account.deposit();

		// run :: ctrl + F11
	}

}
