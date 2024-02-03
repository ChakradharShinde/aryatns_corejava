package com.arya.interfacetypes;

import com.arya.interfacetypes.normal.PrintData;
import com.arya.interfacetypes.normal.PrintDataImpl;

public class IntefaceApp {

	public static void main(String[] args) {
		//can not intanciate object of Inteface
//		PrintData print = new PrintData();
		
		PrintData print = new PrintDataImpl();
//		
		print.printHello();
//		
//		print.printInteger(10);
//		
//		print.printString("I am from India..");
		
//		PrintData.printHelloWorld();
		
		
	}
}
