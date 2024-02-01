package com.arya.staticdemo.stduent;

public class Student {

	private int rollNo;
	private String name;
	private static String collegeName;
	
	static {
		collegeName="Arya";
		System.out.println("Student class static block");
	}
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int rollNo, String name) {
		super();
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
	public static String getCollegeName() {
		return collegeName;
	}
	public static void setCollegeName(String collegeName) {
		Student.collegeName = collegeName;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + " College Name:]" + collegeName;
	}
}
