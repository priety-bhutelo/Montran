package com.montran.main;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
	public static void main(String[] args) {
		Map<Integer, String> employeeMap = new HashMap<Integer, String>();

		employeeMap.put(104, "Melron");
		employeeMap.put(101, "Arjun");
		employeeMap.put(103, "Ali");
		employeeMap.put(102, "Mayank");
		employeeMap.put(104, "Abhishek");
		employeeMap.put(null, null);

		System.out.println(employeeMap);
		System.out.println(employeeMap.size());
		System.out.println("-------------------------------");
		System.out.println(employeeMap.remove(103));
		System.out.println(employeeMap);
		System.out.println(employeeMap.size());

	}
}
