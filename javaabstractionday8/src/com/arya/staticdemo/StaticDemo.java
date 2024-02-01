package com.arya.staticdemo;

import com.arya.staticdemo.stduent.Student;

public class StaticDemo {

	int number1;
	static int number;
	
	static {
		System.out.println("Static demo static block");
	}
	
	public StaticDemo() {
		
		number1=10;
		number=20;
	}
	
	public static void main(String[] args) {
//		System.out.println(number);
//		StaticDemo staticDemo = new StaticDemo();
//		
//		staticDemo.printNumber();
		System.out.println("this is main method");
		
		Student devendra = new Student();
		devendra.setRollNo(1);
		devendra.setName("Devendra");
		
		System.out.println(devendra);
		
		Student imtiyaj = new Student();
		imtiyaj.setRollNo(2);
		imtiyaj.setName("Imtiyaj");
		
		System.out.println(imtiyaj);
		
		
		devendra.setCollegeName("Shankara");
		
		System.out.println(devendra);
		System.out.println(imtiyaj);
	}
	
	public void printNumber() {
		System.out.println(number);
	}
}
