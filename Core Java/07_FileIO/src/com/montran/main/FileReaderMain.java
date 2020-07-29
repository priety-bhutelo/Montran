package com.montran.main;

import java.io.File;

import com.montran.util.FileReaderUtil;

public class FileReaderMain {
	public static void main(String[] args) {
		FileReaderUtil fileReaderUtil = new FileReaderUtil();
		File file = new File("C:/Files/star.txt");

		char[] fileData = fileReaderUtil.readFile(file);

		System.out.println("Data in your file");
		for (char c : fileData) {
			System.out.print(c);
		}

	}
}
