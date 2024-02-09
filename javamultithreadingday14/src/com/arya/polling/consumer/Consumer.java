package com.arya.polling.consumer;

import com.arya.polling.resource.PrintString;

public class Consumer implements Runnable{
	PrintString printString;
	
	public Consumer(PrintString printString) {
		super();
		this.printString = printString;
	}

	public void getMessage() {
		String name=null;
		do {
			name=printString.getString();
			System.out.println("Get:" + name);
		}while(!name.equals("0"));
	}

	@Override
	public void run() {
		getMessage();
	}
}
