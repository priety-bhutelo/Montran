package com.montran.main;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetMain {
	public static void main(String[] args) {
		Set<Integer> numberSet = new TreeSet<Integer>();

		numberSet.add(10);
		numberSet.add(440);
		numberSet.add(100);
		numberSet.add(19);
		numberSet.add(10);
		numberSet.add(91);
		numberSet.add(440);
		numberSet.add(null);

		System.out.println("lenght :: " + numberSet.size());
		System.out.println(numberSet);

		System.out.println("---------------------------------");
		numberSet.remove(10);
		System.out.println("lenght :: " + numberSet.size());
		System.out.println(numberSet);
	}
}
