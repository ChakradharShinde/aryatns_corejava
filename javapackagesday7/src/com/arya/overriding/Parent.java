package com.arya.overriding;

public class Parent {

	public void showParentMessage() {
		System.out.println("this is a Parent class");
	}
	
	final void showProperties() {
		System.out.println("Parent");
	}
	
	public Parent getInstance() {
		return new Parent();
	}
}
