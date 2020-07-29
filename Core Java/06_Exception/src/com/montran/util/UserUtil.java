package com.montran.util;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserUtil {

	private int number;
	private Scanner scanner = new Scanner(System.in);

	public void accept() throws InputMismatchException, NullPointerException {
		System.out.println("Enter Number");
		number = scanner.nextInt();
	}

	public void display() {
		System.out.println("Number :: " + number);
	}
}
