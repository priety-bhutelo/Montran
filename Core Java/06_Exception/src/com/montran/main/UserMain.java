package com.montran.main;

import java.util.InputMismatchException;

import com.montran.util.UserUtil;

public class UserMain {
	public static void main(String[] args) {

		UserUtil userUtil = new UserUtil();

		try {
			userUtil.accept();
		} 
		
		catch (InputMismatchException e) {
			System.out.println("Invalid Input !!");
		} catch (NullPointerException e) {
			System.out.println("Null Pointer Exception");
		}
catch (Exception e) {
			
		}
		
		System.out.println("----------------------------------");
		userUtil.display();

	}
}
