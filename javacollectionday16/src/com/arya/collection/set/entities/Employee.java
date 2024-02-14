package com.arya.collection.set.entities;

public class Employee {

	private int id;
	private String name;
	private int age;
	public Employee() {
		
	}
	public Employee(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public int hashCode() {
		int prime = 37;
		int result = 13;
		result = prime * result + id;
		result = prime * result + name.hashCode();
		result = prime * result + age;
		
		return result;
		
		
//		return 
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj!=null && obj.getClass()!=this.getClass())
			return false;
		
		Employee employee = (Employee)obj;
		
		return (this.getId()==employee.getId() 
					&& this.getName().equals(employee.getName())
					&& this.getAge()==employee.getAge());
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
	
}
