package com.montran.main;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMain {
	public static void main(String[] args) {
		List<String> nameList = new ArrayList<String>();

		nameList.add("Joanna");
		nameList.add("Melron");
		nameList.add("Abhishek");
		nameList.add("Shrinika");
		nameList.add("Joanna");
		nameList.add("Melron");

		System.out.println(nameList);
		System.out.println(nameList.size());
		System.out.println("--------------------------------------");
		nameList.remove("Melron");
		System.out.println(nameList);
		System.out.println(nameList.size());

	}
}
