package com.montran.main;

import java.util.Scanner;

import com.montran.pojo.Account;

public class AccountMainV8 {
	public static void main(String[] args) {
		int accountNumber;
		String name;
		double balance;
		String temp;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter account Number");
		accountNumber = scanner.nextInt();
		scanner.nextLine();

		System.out.println("Enter Name");
		name = scanner.nextLine();
		
		System.out.println("Enter Temp");
		temp = scanner.nextLine();

		System.out.println("Enter Balance");
		balance = scanner.nextDouble();

		System.out.println("Enter Temp");
		temp = scanner.nextLine();

		System.out.println("Enter Balance");
		balance = scanner.nextDouble();

		Account account = new Account(accountNumber, name, balance);
		System.out.println(account);
	}
}
