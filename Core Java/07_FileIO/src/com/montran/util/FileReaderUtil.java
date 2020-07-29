package com.montran.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class FileReaderUtil {
	private Reader reader;
	private char[] data;
	private int fileLength;

	public char[] readFile(File file) {
		fileLength = (int) file.length();
		data = new char[fileLength];
		try {
			reader = new FileReader(file);
			reader.read(data);
			return data;
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoundException :: ");
		} catch (IOException e) {
			System.out.println("IOException :: ");
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				System.out.println("IOException :: ");
			}
		}
		return null;
	}

}
