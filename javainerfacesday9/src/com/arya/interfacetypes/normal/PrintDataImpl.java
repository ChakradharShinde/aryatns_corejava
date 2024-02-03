package com.arya.interfacetypes.normal;

public class PrintDataImpl implements PrintData{

	public void printInteger(int number) {
		System.out.println(number);
	}
	
	public void printString(String message) {
		System.out.println(message);
	}
	
	@Override
	public void printHello() {
		System.out.println("Hello from implementing class..");
	}
}
