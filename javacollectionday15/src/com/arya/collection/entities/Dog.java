package com.arya.collection.entities;

import java.util.Comparator;

public class Dog implements Comparable<Dog>{

	private String name;
	private String feature;
	private float price;

	public Dog(String name, String feature, float price) {
		super();
		this.name = name;
		this.feature = feature;
		this.price = price;
	}

	public Dog() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFeature() {
		return feature;
	}

	public void setFeature(String feature) {
		this.feature = feature;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	
	@Override
	public int compareTo(Dog dogObj) {
		return (int) (dogObj.getPrice()-this.getPrice());
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + ", feature=" + feature + ", price=" + price + "]";
	}

	
}
