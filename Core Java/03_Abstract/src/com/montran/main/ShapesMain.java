package com.montran.main;

import java.util.Scanner;

import com.montran.pojo.Circle;
import com.montran.pojo.Shapes;
import com.montran.pojo.Triangle;

public class ShapesMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int shapeChoice;
		Shapes shapes = null;

		System.out.println("1.. Draw Circle");
		System.out.println("2.. Draw Triangle");
		shapeChoice = scanner.nextInt();

		switch (shapeChoice) {
		case 1:
			shapes = new Circle();
			break;
		case 2:
			shapes = new Triangle();
			break;
		}

		shapes.drawShape();
		scanner.close();
	}
}
