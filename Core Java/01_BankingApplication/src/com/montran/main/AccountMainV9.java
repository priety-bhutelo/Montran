package com.montran.main;

import com.montran.pojo.Current;

public class AccountMainV9 {
	public static void main(String[] args) {
		Current current = new Current(101, "Test", 1000, 100000);

		Current current2 = null;

		System.out.println("current :: " + current.hashCode());
		// System.out.println("current2 :: " + current2.hashCode());

		current2 = current;

		System.out.println("current");
		System.out.println(current);
		System.out.println("current2");
		System.out.println(current2);
		System.out.println("----------------------------------");
		System.out.println(current.hashCode());
		System.out.println(current2.hashCode());
		System.out.println("----------------------------------");
		System.out.println("change balance using current2");
		current2.setBalance(3000);
		System.out.println("----------------------------------");
		System.out.println("current");
		System.out.println(current);
		System.out.println("current2");
		System.out.println(current2);
		System.out.println("----------------------------------");
		current2 = new Current(102, "Test2", 2000, 20000);
		System.out.println("----------------------------------");
		System.out.println("current");
		System.out.println(current);
		System.out.println("current2");
		System.out.println(current2);
		System.out.println("----------------------------------");
		current = current2;
		System.out.println("----------------------------------");
		System.out.println("current");
		System.out.println(current);
		System.out.println("current2");
		System.out.println(current2);
		System.out.println("----------------------------------");

		System.out.println("end");

	}
}
