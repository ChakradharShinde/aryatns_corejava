package com.arya.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FinallyDemo {

	public static void main(String[] args) {
//		try {
//			System.out.println(10/1);
//			System.exit(0);
//		}finally {
//			System.out.println("Finally Block");
//			try {
//				
//			} catch (Exception e) {
//				// TODO: handle exception
//			}
//		}
//		}catch(ArithmeticException e) {
//			
//		}
		
		// Try with resources
		try(Scanner scanner = new Scanner(System.in)){
			int number = scanner.nextInt();
		}catch(RuntimeException numberFormatException) {
			System.out.println(numberFormatException.getMessage());
		}
	}
}
