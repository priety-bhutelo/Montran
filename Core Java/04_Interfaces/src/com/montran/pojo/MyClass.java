package com.montran.pojo;

import com.montran.interfaces.MyInterface;
import com.montran.interfaces.MyNewInterface;

public class MyClass implements MyInterface, MyNewInterface {

	@Override
	public void show() {
		System.out.println("Show method of MyClass");
	}

	@Override
	public void print() {
		System.out.println("print method of MyClass");
	}

}
