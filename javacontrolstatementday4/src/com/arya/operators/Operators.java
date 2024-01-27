package com.arya.operators;

public class Operators {

	public static void main(String[] args) {
		unaryOperators();
		bitwiseOperators();
	}
	
	static void unaryOperators() {
		int number1=10;
		int number2=20;
		int number3=30;
		int result;
		result = ++number1 + number3  + number2--;
		System.out.println(result);
		System.out.println(number1);
		System.out.println(number2);
		
		unaryOperatorWithArgument(number3++);
	}
	
	static void unaryOperatorWithArgument(int number) {
		System.out.println(number);
	}
	
	static void bitwiseOperators() {
		int number=-10;
		System.out.println(Integer.toBinaryString(number));
		int result = -10>>>1;
		System.out.println(Integer.toBinaryString(result));
//		System.out.println(result);
		
	}
}
