package com.montran.pojo;

public abstract class Account extends Object {
	// instance variable
	private static int accountnumberCounter = 100;
	private int accountNumber;
	private String name;
	private double balance;

	// default constructor
	public Account() {
		System.out.println("Default constructor of Account");
	}

	public Account(int accountNumber, String name, double balance) {
		System.out.println("Param constructor of Account");
		accountnumberCounter++;
		this.accountNumber = accountnumberCounter;
		this.name = name;
		this.balance = balance;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public abstract boolean deposit(double amount);

	public abstract boolean withdraw(double amount);

	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", name=" + name + ", balance=" + balance + "]";
	}

}
