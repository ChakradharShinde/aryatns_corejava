package com.arya.abstraction.arithmaticoperation;

public class ArithmaticOperation extends AbstractArithmaticOperation{

	private int number1;
	private int number2;
	public ArithmaticOperation() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ArithmaticOperation(int number1, int number2) {
		super();
		this.number1 = number1;
		this.number2 = number2;
	}
	public int getNumber1() {
		return number1;
	}
	public void setNumber1(int number1) {
		this.number1 = number1;
	}
	public int getNumber2() {
		return number2;
	}
	public void setNumber2(int number2) {
		this.number2 = number2;
	}
	
	//addition
	@Override
	public int add() {
		return number1+number2;
	}
	
	@Override
	public String toString() {
		return "ArithmaticOperationa [number1=" + number1 + ", number2=" + number2 + "]";
	}
	
	
}
