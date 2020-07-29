package com.montran.main;

public class StaticMain {
	private static int num1 = 10;
	private int num2 = 10;

	public void display() {
		System.out.println("static num1 = " + num1);
		System.out.println("num2 = " + num2);
		num1 = num1 + 10;
		num2 = num2 + 10;
		System.out.println("static num1 = " + num1);
		System.out.println("num2 = " + num2);
	}

	public static void main(String[] args) {
		System.out.println("Start");
		// Demo.display();
		// Demo demo = new Demo();
		try {
			Class.forName("com.montran.main.Demo");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Demo.display();
		System.out.println("End");
	}
}
