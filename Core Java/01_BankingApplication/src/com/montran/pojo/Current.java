package com.montran.pojo;

public class Current extends Account {
	private double overdraftBalance;

	public Current() {
		// TODO Auto-generated constructor stub
	}

	public Current(int accountNumber, String name, double balance, double overdraftBalance) {
		super(accountNumber, name, balance);
		this.overdraftBalance = overdraftBalance;
	}

	public double getOverdraftBalance() {
		return overdraftBalance;
	}

	public void setOverdraftBalance(double overdraftBalance) {
		this.overdraftBalance = overdraftBalance;
	}

	@Override
	public boolean withdraw(double amount) {
		if (amount > 0 && amount <= getBalance()) {
			System.out.println("saidhiasfhesdif");
			setBalance(getBalance() - amount);
			return true;

		}
		if (amount > 0 && getBalance() <= amount && (amount + getBalance() < overdraftBalance)) // amount = 15000 ,
																								// bal=7000,
		{
			System.out.println("saidhiasfhesdif");
			double tempVariable = amount - getBalance();
			overdraftBalance = overdraftBalance - tempVariable;
			System.out.println("saidhiasfhesdif");
			setBalance(0.0);
			return true;

		}

		return false;
	}

	@Override
	public boolean deposit(double amount) {
		return false;
	}

	@Override
	public String toString() {
		return "Current [overdraftBalance=" + overdraftBalance + ", getAccountNumber()=" + getAccountNumber()
				+ ", getName()=" + getName() + ", getBalance()=" + getBalance() + "]";
	}

}
