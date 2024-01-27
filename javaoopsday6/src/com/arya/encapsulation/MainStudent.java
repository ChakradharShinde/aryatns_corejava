package com.arya.encapsulation;

import com.arya.encapsulation.entities.Student;

public class MainStudent {

	public static void main(String[] args) {
		Student student = new Student();
		
//		int rollNo=student.rollNo;
//		String name=student.name;
//		byte age=student.age;
//		student.setRollNo(10);
		
		student.setRollNo(-1);
		student.setName("Nemendra");
		student.setAge((byte)20);
		
		System.out.println(student.getRollNo()+student.getName()+student.getAge());
		
		System.out.println(student.toString());
	}
	
}
