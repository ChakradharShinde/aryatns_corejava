package com.arya.inheritance.single.classes;

public class Child extends Parent{
	String firstName;
	
	public Child() {
		super();// constructor chaining
	}
	
	//Variable Shadowing
	public Child(String firstName, String lastName1) {
//		super(lastName);// parameterized constructor of super class
		
		this.firstName=firstName;
		lastName=lastName1;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Override
	public String toString() {
		return "Child [firstName=" + firstName + "]";
	}
	
	
}
