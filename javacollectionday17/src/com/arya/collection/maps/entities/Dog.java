package com.arya.collection.maps.entities;

import java.util.Objects;

public class Dog {

	private String name;
	private String price;
	public Dog(String name, String price) {
		super();
		this.name = name;
		this.price = price;
	}
	public Dog() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj!=null && obj.getClass()!=this.getClass())
			return false;
		
		Dog dog = (Dog)obj;
		
		return (dog.getName().equals(this.getName()) && dog.getPrice().equals(this.getPrice()));
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(this.name, this.price);
	}
	
	
	@Override
	public String toString() {
		return "Dog [name=" + name + ", price=" + price + "]";
	}
	
}
