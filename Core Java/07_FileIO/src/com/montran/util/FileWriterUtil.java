package com.montran.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterUtil {
	private FileWriter writer;

	public void writeFile(File file, char[] data) {
		try {
			writer = new FileWriter(file);
			writer.write(data);
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoundException");
		} catch (IOException e) {
			System.out.println("IOException");
		} finally {
			try {
				writer.close();
			} catch (IOException e) {
				System.out.println("IOException");
			}
		}
	}
}
