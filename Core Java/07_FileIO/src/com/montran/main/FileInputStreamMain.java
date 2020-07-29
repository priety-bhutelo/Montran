package com.montran.main;

import java.io.File;
import java.util.Scanner;

import com.montran.util.FileInputStreamUtil;

public class FileInputStreamMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		FileInputStreamUtil util = new FileInputStreamUtil();
		String filePath;
		File file;
		byte[] fileData;

		System.out.println("Enter path of file");
		filePath = scanner.nextLine();
		file = new File(filePath);

		fileData = util.getFileData(file);

		System.out.println("Data From File");
		for (byte b : fileData) {
			System.out.print((char) b);
		}
		scanner.close();
	}
}
