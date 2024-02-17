package com.arya.generics.operation;

public class Operation<T extends Number> {

	private T obj1;
	private T obj2;
	
	public Operation(T obj1, T obj2) {
		super();
		this.obj1 = obj1;
		this.obj2 = obj2;
	}

	public double add() {
		return obj1.doubleValue() + obj2.doubleValue();
	}
}
