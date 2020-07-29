package com.montran.util;

public class ArrayUtil {

	public void printArray(int numbers[]) {
		for (int i : numbers) {
			System.out.println(i);
		}
	}

	public int findMax(int numbers[]) {
		int max = 0;
		for (int i : numbers) {
			if (i > max) {
				max = i;
			}
		}
		return max;
	}

	public int findMin(int numbers[]) {
		int min = numbers[0];
		for (int i : numbers) {
			if (min > i) {
				min = i;
			}
		}
		return min;
	}

}
