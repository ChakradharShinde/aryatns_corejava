package com.arya.polling.supplier;

import com.arya.polling.resource.PrintString;

public class Supplier implements Runnable{

	PrintString printString;
	
	public Supplier(PrintString printString) {
		super();
		this.printString = printString;
	}

	public void setMessage() {
		String msg = "Nemendra, Khushal, Akhilesh, Tanu, 0";
		String[] strArray = msg.split(", ");
		for(String name:strArray)
			printString.setString(name);
	}

	@Override
	public void run() {
		setMessage();
	}
}
