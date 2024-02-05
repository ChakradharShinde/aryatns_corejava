package com.arya.exception.custom;

//Checked Exception
public class UnderAgeException extends Exception{

	public UnderAgeException() {
		super();
	}

	public UnderAgeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public UnderAgeException(String message, Throwable cause) {
		super(message, cause);
	}

	public UnderAgeException(String message) {
		super(message);
	}

	public UnderAgeException(Throwable cause) {
		super(cause);
	}

	
}
