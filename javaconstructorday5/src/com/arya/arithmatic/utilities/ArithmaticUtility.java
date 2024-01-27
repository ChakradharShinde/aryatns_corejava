package com.arya.arithmatic.utilities;

import java.util.Scanner;

public class ArithmaticUtility {
	int number1;
	int number2;
	
	Scanner scanner;
	
	//Default Constructor
	public ArithmaticUtility() {
		scanner = new Scanner(System.in);
	}
	
	
	//Parameterizes Constructor
	//Variable Shadowing
	public ArithmaticUtility(int number1, int number2) {
		this.number1=number1;
		this.number2=number2;
		scanner = new Scanner(System.in);
	}
	
	public int printMenu() {
		System.out.println("1. For Addition");
		System.out.println("2. For Substraction");
		System.out.println("3. For Multiplication");
		System.out.println("4. For Division");
		System.out.println("5. For Modulo");
		System.out.println("0. For Exit..");
		
		return scanner.nextInt();
		
	}
	
	public void addition() {
		System.out.println(number1+number2);
	}
	
	public void multiplication() {
		System.out.println(number1*number2);
	}
	
}
