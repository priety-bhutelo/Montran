package com.montran.main;

import java.io.File;
import java.util.Scanner;

import com.montran.util.FileUtil;

public class FileMainV1 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		File file = null;
		FileUtil fileUtil = new FileUtil();
		String path;

		System.out.println("Enter file path to print metadata");
		path = scanner.next();

		file = new File(path);
		fileUtil.printMetadata(file);
		scanner.close();
	}
}
