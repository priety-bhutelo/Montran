package com.montran.main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MyMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = 0;

		try {
			System.out.println("Enter Number");
			number = scanner.nextInt();
		} catch (InputMismatchException input) {
			System.out.println("Invalid Input");
		} catch (NullPointerException any) {
			System.out.println("Null Pointer Input");
		} catch (Exception thing) {
			System.out.println("Exception !!");
		} finally {
			System.out.println("in finally");
			scanner.close();
		}
		System.out.println("Number is :: " + number);

	}
}
