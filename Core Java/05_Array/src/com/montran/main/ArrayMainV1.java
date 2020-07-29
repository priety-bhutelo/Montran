package com.montran.main;

import java.util.Scanner;

public class ArrayMainV1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int i[] = new int[5];

		System.out.println("Enter Numbers");
		for (int j = 0; j < i.length; j++) {
			i[j] = scanner.nextInt();
		}
		
		System.out.println("------------------------------------");
		
		System.out.println("Array Elements");
		for (int j : i) {
			System.out.println(j);
		}

	}
}
