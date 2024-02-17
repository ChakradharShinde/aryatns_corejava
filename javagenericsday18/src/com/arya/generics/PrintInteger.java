package com.arya.generics;

public class PrintInteger {

	private Integer number;

	public PrintInteger(Integer number) {
		super();
		this.number = number;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "PrintInteger [number=" + number + "]";
	}
}
