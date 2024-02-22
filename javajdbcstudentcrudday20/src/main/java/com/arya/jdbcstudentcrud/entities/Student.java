package com.arya.jdbcstudentcrud.entities;

public class Student {

	private int rollNo;
	private String name;
	private String phoneNo;
	
	public Student() {}
	
	public Student(int rollNo, String name, String phoneNo) {
		this.rollNo = rollNo;
		this.name = name;
		this.phoneNo = phoneNo;
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
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", phoneNo=" + phoneNo + "]";
	}
}
