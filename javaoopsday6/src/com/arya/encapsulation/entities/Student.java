package com.arya.encapsulation.entities;

public class Student {

	private int rollNo;
	private String name;
	private byte age;
	
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
	public byte getAge() {
		return age;
	}
	public void setAge(byte age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", age=" + age + "]";
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int rollNo, String name, byte age) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
	}
	
	//setter for rollNo
	//Setters and getters must be public
}
