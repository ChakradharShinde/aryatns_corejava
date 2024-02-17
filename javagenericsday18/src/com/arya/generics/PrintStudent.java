package com.arya.generics;

public class PrintStudent {

	private Student student;
	
	public PrintStudent(Student student) {
		super();
		this.student = student;
	}

	public Student getStudent() {
		return student;
	}



	public void setStudent(Student student) {
		this.student = student;
	}



	public void printStudent(Student student) {
		System.out.println(student);
	}
}
