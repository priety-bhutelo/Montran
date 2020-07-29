package com.montran.main;

public class Demo {

	int num1 = 10;
	static int num2 = 10;

	static {
		System.out.println("We are in static block");
	}

	public Demo() {
		System.out.println("We are in default constructor");
	}

	public static void display() {
		System.out.println("In static method display()");
		// System.out.println("num1 :: " + num1);
		System.out.println("num2 :: " + num2);
	}
}
