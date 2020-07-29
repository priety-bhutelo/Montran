package com.montran.main;

import java.io.File;
import java.util.Scanner;

import com.montran.util.BufferedReaderWriterUtil;

public class BufferedReaderWriterMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String filePath;
		String data;
		BufferedReaderWriterUtil bufferedReaderWriterUtil = new BufferedReaderWriterUtil();
		File file;

		System.out.println("Enter file path::");
		filePath = scanner.nextLine();
		file = new File(filePath);

		System.out.println("Enter data to write into file:");
		data = scanner.nextLine();
		bufferedReaderWriterUtil.writeFile(file, data);

		System.out.println("Data from file:");
		System.out.println(data);

		scanner.close();
	}

}
