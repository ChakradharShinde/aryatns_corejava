package com.arya.aggregation.student;

import com.arya.aggregation.address.Address;

public class Student {
	private int rollNo;
	private String name;
	private byte age;
	private Address address;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int rollNo, String name, byte age, Address address) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
		this.address = address;
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
	public byte getAge() {
		return age;
	}
	public void setAge(byte age) {
		this.age = age;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", age=" + age + ", address=" + address + "]";
	}
	
	
}
