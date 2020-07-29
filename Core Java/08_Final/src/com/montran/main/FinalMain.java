package com.montran.main;

import com.montran.pojo.Product;

public class FinalMain {
	private final int number = 100;

	public void display() {
		// number = number + 10;

		System.out.println("Number =" + number);
	}

	public static void main(String[] args) {
		FinalMain finalMain = new FinalMain();
		finalMain.display();
		
		Product product = new Product();
		product.display();
	}
}
