package com.arya.multithreading.lifecycle;

public class PrintTable implements Runnable{

	private int number;
	
	public PrintTable(int number) {
		this.number = number;
	}

	public void printTable() {
		for(int i=1;i<11;i++)
			System.out.println(number + "X" + i + " = " + number*i);
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		printTable();	
	}
}
