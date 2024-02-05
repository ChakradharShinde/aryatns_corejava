package com.arya.autoboxing;

public class AutoBoxingDemo {

	public static void main(String[] args) {
		String msg = "10";
		Integer number1 = new Integer("10");
		
		Integer number4 = Integer.parseInt("120");
		
//		CP/LP
		Integer number2=10;
		
		
//		autoboxing
		int value=10;
		Integer number3=value;
		
		
//		autoUnboxing
		int value1 = 0;
		
		System.out.println(number3);
	}
}
