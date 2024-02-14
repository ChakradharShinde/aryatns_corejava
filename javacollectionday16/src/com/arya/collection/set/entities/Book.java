package com.arya.collection.set.entities;

public class Book implements Comparable<Book>{

	private String name;
	private String author;
	private float price;

	public Book() {
	}

	public Book(String name, String author, float price) {
		super();
		this.name = name;
		this.author = author;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [name=" + name + ", author=" + author + ", price=" + price + "]";
	}

	@Override
	public int compareTo(Book book) {
		return this.getName().compareTo(book.getName());
	}

}
