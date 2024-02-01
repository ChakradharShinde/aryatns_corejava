package com.arya.overriding;

public class Executor {

	public static void main(String[] args) {
		Child child = new Child();
		try {
			child.showProperties();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		Parent parent = new Child();//child.getInstance();
		
		parent.showParentMessage();
		
		parent.showProperties();
		
	}
}
