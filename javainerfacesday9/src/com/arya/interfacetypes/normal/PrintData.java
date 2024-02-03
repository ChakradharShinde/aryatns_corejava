package com.arya.interfacetypes.normal;

public interface PrintData {

//	public abstract void printInteger(int number);
	// abstract method
	void printInteger(int number);
	void printString(String message);
//	void printFloat(float floatNumber);
	
	
	// version 1.8
	default void printHello() {
		System.out.println("Hello");
		printHi();
	}
	
	
	// version 1.8
	static void printHelloWorld() {
		System.out.println("Hello World");
	}
	
	
	//version 1.9
	private void printHi() {
		System.out.println("Hi");
	}
}
