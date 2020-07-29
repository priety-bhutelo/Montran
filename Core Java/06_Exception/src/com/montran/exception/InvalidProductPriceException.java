package com.montran.exception;

public class InvalidProductPriceException extends Exception {

	public InvalidProductPriceException() {
		System.out.println("InvalidProductPriceException !!");
	}

	@Override
	public String getMessage() {
		return "Product price should be > 0";
	}
}
