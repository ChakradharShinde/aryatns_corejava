package com.arya.multithreading.thread;

// Implementing Runnable Interface
public class Print implements Runnable{

	String msg;

	public Print(String msg) {
		super();
		this.msg = msg;
	}
	
	@Override
	public void run() {
		System.out.println("Hello " + msg);
	}
}
