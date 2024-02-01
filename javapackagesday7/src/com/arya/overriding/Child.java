package com.arya.overriding;

public class Child extends Parent {

	
	// Overridden method should have more visibility for Access Modifiers, 
	//and should throw same or subtype exception than overriding method 
	@Override
	protected void showProperties(){
		System.out.println("Child");
	}
	
	
//	@Override
//	public Parent getInstance() {
//		return new Parent();
//	}
	
	
	//Covariant overriding
	@Override
	public Child getInstance() {
		return new Child();
	}
	
	public void showChildMessage() {
		System.out.println("This is a Child class");
	}
	
}
