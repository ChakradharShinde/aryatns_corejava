package com.arya.interfacetypes;

import com.arya.interfacetypes.functional.Addition;
import com.arya.interfacetypes.functional.ArithmaticOperation;
import com.arya.interfacetypes.functional.Substraction;

public class FunctionalInterfaceApp {

	public static void main(String[] args) {
//		ArithmaticOperation addition = new Addition();
//		int result=addition.operation(10, 20);
//		System.out.println(result);
//		
//		//polymorphism
////		addition = new Substraction();
//		ArithmaticOperation substraction = new Substraction();
//		System.out.println(addition.operation(20, 10));
//		
//		
////		annonymous class
//		ArithmaticOperation multiplication = 
//				new ArithmaticOperation() {
//			@Override
//			public int operation(int number1, int number2) {
//				return number1*number2;
//			}
//		};
//		
//		
//		System.out.println(multiplication.operation(10, 10));
//		
		
		//lambda expression
		ArithmaticOperation addition = (int number1 , int number2) -> number1+number2;
		ArithmaticOperation substraction = (int number1 , int number2) -> number1-number2;
		ArithmaticOperation multiplication = (int number1 , int number2) -> number1*number2;
		ArithmaticOperation division = (int number1 , int number2) -> number1/number2;
//		ArithmaticOperation division = (int number1 , int number2) -> number1/number2;
		
		System.out.println("Addition:" + addition.operation(10, 20));
		System.out.println("substraction:" + substraction.operation(10, 20));
		System.out.println("multiplication:" + multiplication.operation(10, 20));
		System.out.println("division:" + division.operation(10, 20));
	}
}
