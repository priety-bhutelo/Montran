package com.montran.main;

import java.util.Scanner;

import com.montran.exception.InvalidProductPriceException;
import com.montran.pojo.Product;

public class ProductMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Product product = null;
		int productId;
		String name;
		double price;

		try {
			System.out.println("Enter ProductId");
			productId = scanner.nextInt();

			System.out.println("Enter Name");
			name = scanner.next();

			System.out.println("Price");
			price = scanner.nextDouble();

			product = new Product(productId, name, price);
		} catch (InvalidProductPriceException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println("Exception " + e.getMessage());
		} finally {
			scanner.close();
		}
		System.out.println(product);

	}
}
