package com.montran.main;

import java.util.Scanner;

import com.montran.util.ArrayUtil;

public class ArrayMainV2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayUtil arrayUtil = new ArrayUtil();
		int i[] = new int[5];

		// accept numbers from user (min 5 max 10)
		System.out.println("Enter Numbers");
		for (int j = 0; j < i.length; j++) {
			i[j] = scanner.nextInt();
		}

		// pass the numbers to printArray method of class ArrayUtil
		arrayUtil.printArray(i);
		System.out.println("------------------------");
		
		//print the max value from array
		System.out.println("Max value :: " + arrayUtil.findMax(i));
		
		//print the min value from array
		System.out.println("Min value :: " + arrayUtil.findMin(i));

	}
}
