package com.montran.main;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapMain {
	public static void main(String[] args) {
		Map<Integer, String> employeeMap = new TreeMap<Integer, String>();

		employeeMap.put(1004, "Melron");
		employeeMap.put(11, "Arjun");
		employeeMap.put(130, "Ali");
		employeeMap.put(12, "Mayank");
		employeeMap.put(140, "Abhishek");

		System.out.println(employeeMap);
		System.out.println(employeeMap.size());
		System.out.println("-------------------------------");
		employeeMap.remove(130);
		System.out.println(employeeMap);
		System.out.println(employeeMap.size());
	}
}
