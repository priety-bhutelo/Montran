package com.montran.main;

import java.io.File;
import java.util.Scanner;

import com.montran.util.FileWriterUtil;

public class FileWriterMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String data;
		FileWriterUtil filewriterUtil = new FileWriterUtil();
		File file = new File("c:/Files/sample.txt");

		System.out.println("Enter data for file:");
		data = scanner.nextLine();
		filewriterUtil.writeFile(file, data.toCharArray());
		System.out.println("Please check your file");
		scanner.close();
	}

}
