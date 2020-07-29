package com.montran.main;

import java.io.File;
import java.util.Scanner;

import com.montran.util.FileOutputStreamUtil;

public class FileOutputStreamMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		FileOutputStreamUtil util = new FileOutputStreamUtil();
		String filePath;
		String data = "";
		String lineOneData;
		String lineTwoData;
		File file;

		System.out.println("Enter Path");
		filePath = scanner.next();
		file = new File(filePath);

		scanner.nextLine();
		System.out.println("Enter Data for file line one");
		lineOneData = scanner.nextLine();
		System.out.println("Enter Data for file line two");
		lineTwoData = scanner.nextLine();

		data = lineOneData + "\n" + lineTwoData;

		util.writeDataIntoFile(file, data.getBytes());

		System.out.println("Please check your file !!");
		scanner.close();
	}
}
