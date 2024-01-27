package com.arya.pojos;

public class Student {

	int rollNo;
	String name;
	byte age;
	
	// am return method(args);
	
	public Student() {}

	// Variable Shadowing
	public Student(int rollNo, String name, byte age) {
		this.rollNo=rollNo;
		this.name=name;
		this.age=age;
	}
	
	public Student(int rollNo) {
		this.rollNo=rollNo;
	}
	
	public void printProperties() {
		System.out.println("Roll No:" + rollNo + " Name:" + name + " Age:" + age);
	}
}
