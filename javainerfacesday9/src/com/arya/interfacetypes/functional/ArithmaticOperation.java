package com.arya.interfacetypes.functional;

@FunctionalInterface
public interface ArithmaticOperation {
	
	int operation(int number1, int number2);
	
//	Object class method is allowed
//	String toString();
//	void operation1();
	
}
