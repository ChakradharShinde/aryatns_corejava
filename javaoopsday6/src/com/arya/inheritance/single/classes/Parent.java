package com.arya.inheritance.single.classes;

public class Parent {
	protected String lastName;
	
	public Parent() {
		this.lastName=null;
	}
	
	public Parent(String lastName) {
		this.lastName=lastName;
	}

	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	@Override
	public String toString() {
		return "Parent [lastName=" + lastName + "]";
	}
	
	
	
}
