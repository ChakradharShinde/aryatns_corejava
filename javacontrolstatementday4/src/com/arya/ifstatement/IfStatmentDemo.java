package com.arya.ifstatement;

public class IfStatmentDemo {

	public static void main(String[] args) {
		
		ifStatement();
		ifElseStatement();
		elseIfLadder();
		switchStatement();
		ternaryOperation();
	}
	
	static void ifStatement() {
		boolean isValid = true;
		if(isValid)
			System.out.println("true");
	}
	
	static void ifElseStatement() {
		boolean isValid = false;
		if(isValid) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
	}
	
	static void elseIfLadder() {
		int marks = 60;
		if(marks >=90)
			System.out.println("A grade");
		else if(marks >= 80)
			System.out.println("B Grade");
		else if ( marks >= 70)
			System.out.println("C Grade");
		else 
			System.out.println("Failed..");
	}
	
	
	static void switchStatement() {
		char ch = '7';
//		switch(ch) {
//			case '1':	System.out.println("Monday");
//				 	 	break;
//			case '7': 	System.out.println("Sunday");
//						break;
//			case '8':	System.out.println("Sunday +");
//						break;
//			default : 	System.out.println("Invalid Input");
//		
//		}
		
		// after java 8
		
		switch(ch) {
			case '1'-> System.out.println("Monday");
			case '7'-> {
							System.out.println("this is case 7");
							System.out.println("Sunday..");
						}
			default -> System.out.println("Invalid Output please input values in range of 1-7");
		}
	}
	
	static void ternaryOperation() {
		int number1 = 10;
		int number2 = 20;
		int number3 = 15;
		
//		int greater = (number1>number2) ? number1:number2;
//		System.out.println("Greater number in number1 and Number2 is:" + greater);
		
		
		// nested ternary operation
		int greater = (number1>number2) ? 
							((number1>number3)?number1:number3) 
							:((number2>number3)?number2:number3);
		
		System.out.println("Greater number between number1 and Number2 and number3 is:" + greater);
	}
}
