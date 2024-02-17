package com.arya.generics.operation;

public class MainOperation {

	public static void main(String[] args) {
		Operation<Integer> integerOperation = new Operation<>(10,20);
		System.out.println(integerOperation.add());
		
		Operation<Float> floatOperation = new Operation<>(10.12f, 20.231f);
		System.out.println(floatOperation.add());
	}
}
