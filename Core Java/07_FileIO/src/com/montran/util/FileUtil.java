package com.montran.util;

import java.io.File;
import java.util.Date;

public class FileUtil {
	public void printMetadata(File file) {
		System.out.println("File Name :: " + file.getName());
		System.out.println("Absolute Path :: " + file.getAbsolutePath());
		System.out.println("Size of file :: " + file.length() + " bytes");
		System.out.println("is File exists :: " + file.exists());
		Date date = new Date(file.lastModified());
		System.out.println("Last Modified date :: " + date);
	}
}
