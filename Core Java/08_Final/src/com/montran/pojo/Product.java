package com.montran.pojo;

public final class Product {
	private int productId;
	private String name;
	private double price;
	private final double discount = 10;

	public final void display() {
		System.out.println("display method of product !!");
	}
}
