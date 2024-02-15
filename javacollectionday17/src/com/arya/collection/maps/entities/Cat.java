package com.arya.collection.maps.entities;

public class Cat implements Comparable<Cat>{
	private String name;
	private float price;
	public Cat() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Cat(String name, float price) {
		super();
		this.name = name;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Cat [name=" + name + ", price=" + price + "]";
	}
	@Override
	public int compareTo(Cat cat) {
		return (int)(this.getPrice()-cat.getPrice());
	}
}
