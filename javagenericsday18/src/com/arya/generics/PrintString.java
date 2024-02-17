package com.arya.generics;

public class PrintString {

	private String message;

	public PrintString(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "PrintString [message=" + message + "]";
	}
}
