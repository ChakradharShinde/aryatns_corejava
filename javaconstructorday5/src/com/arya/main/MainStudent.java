package com.arya.main;

import com.arya.pojos.Student;

public class MainStudent {

	public static void main(String[] args) {
		Student student = new Student(); // Default Constructor
		
		Student student1 = new Student(1, "XYZ", (byte) 23);
		
		Student student3 = new Student(10);
		
		new Student();
		
		student.printProperties();
		student1.printProperties();
		student3.printProperties();
	}
}
