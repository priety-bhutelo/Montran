package com.montran.main;

import java.util.HashSet;
import java.util.Set;

public class HashSetMain {
	public static void main(String[] args) {
		Set<Integer> numberSet = new HashSet<Integer>();

		numberSet.add(10);
		numberSet.add(440);
		numberSet.add(100);
		numberSet.add(19);
		numberSet.add(10);
		numberSet.add(91);
		numberSet.add(440);

		System.out.println("lenght :: " + numberSet.size());
		System.out.println(numberSet);

		System.out.println("---------------------------------");
		numberSet.remove(10);
		System.out.println("lenght :: " + numberSet.size());
		System.out.println(numberSet);
	}
}
