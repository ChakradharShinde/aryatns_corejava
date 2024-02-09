package com.arya.polling;

import com.arya.polling.consumer.Consumer;
import com.arya.polling.resource.PrintString;
import com.arya.polling.supplier.Supplier;

public class PollingDemo {

	public static void main(String[] args) {
		PrintString printString = new PrintString();
		
		Consumer consumer = new Consumer(printString);
		Supplier supplier = new Supplier(printString);
		
		Thread consumerThread = new Thread(consumer);
		Thread supplierThread = new Thread(supplier);
		
		consumerThread.start();
		supplierThread.start();
	}
}
