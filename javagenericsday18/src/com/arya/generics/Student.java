package com.arya.generics;

public class Student implements Comparable<Student>{

	private int rollNo;
	private String name;
	public Student() {
		
	}
	public Student(int rollNo, String name) {
		this.rollNo = rollNo;
		this.name = name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + "]";
	}
	@Override
	public int compareTo(Student student) {
		return this.rollNo-student.rollNo;
	}
}
