package com.arya.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionDemo {

	public static void main(String[] args) {
		
		System.out.println("Hello");
		
		
		try {
			try {
				int number1=10;
				int number2=0;
				System.out.println(number1/number2);
				System.out.println("After / Zero Exception");
			} catch (ArithmeticException e) {
				e.printStackTrace();
				
				int number1=10;
				int number2=1;
				System.out.println(number1/number2);
				System.out.println("After / Zero Exception");
			}
			FileInputStream fileInput = 
					new FileInputStream("E:/text.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
