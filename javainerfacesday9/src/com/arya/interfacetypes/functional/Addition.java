package com.arya.interfacetypes.functional;

public class Addition implements ArithmaticOperation{

	@Override
	public int operation(int number1, int number2) {
		return number1+number2;
	}

	
}
