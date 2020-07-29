package com.montran.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedReaderWriterUtil {
	private BufferedReader reader;
	private BufferedWriter writer;
	private String data="";

	public String readFile(File file) {
		try {
			reader = new BufferedReader(new FileReader(file));
			String temp = reader.readLine();
			while (temp != null) {
				data = data + temp;
				temp = reader.readLine();
			}
			return data;
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}
		return null;
	}

	public void writeFile(File file, String data) {
		try {
			writer = new BufferedWriter(new FileWriter(file));
			writer.write(data);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
