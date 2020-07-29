package com.montran.main;

import java.util.Scanner;

import com.montran.pojo.Account;

public class AccountMainV3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int accountNumber;
		String name;
		double balance;
		int amount;
		int trainsactionChoice;
		String continueChoice;
		boolean result;

		System.out.println(" Hello Welcome to XYZ Bank !!");
		System.out.println("Enter account Number");
		accountNumber = scanner.nextInt();

		System.out.println("Enter Name");
		name = scanner.next();

		System.out.println("Enter Salary");
		balance = scanner.nextDouble();

		Account account = new Account();
		account.setAccountNumber(accountNumber);
		account.setName(name);
		account.setBalance(balance);

		do {
			System.out.println("Menu");
			System.out.println("1. Withdraw");
			System.out.println("2. Deposit");
			System.out.println("3. Balance");
			System.out.println("Enter your choice");
			trainsactionChoice = scanner.nextInt();

			switch (trainsactionChoice) {
			case 1:
				System.out.println("Enter amount to withdraw");
				amount = scanner.nextInt();
				result = account.withdraw(amount);
				if (result)
					System.out.println("Transaction Success !!");
				else
					System.out.println("Transaction Failed !!");
				break;
			case 2:
				System.out.println("Enter amount to deposit");
				amount = scanner.nextInt();
				result = account.deposit(amount);
				if (result)
					System.out.println("Transaction Success !!");
				else
					System.out.println("Transaction Failed !!");
				break;
			case 3:
				System.out.println("Account Balance :: " + account.getBalance());
				break;
			default:
				System.out.println("Invalid choice");
				break;
			}

			System.out.println("Do you want to continue ?");
			continueChoice = scanner.next();
		} while (continueChoice.equals("yes"));
		scanner.close();

	}

}
