package com.arya.collection.treeset;

import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

import com.arya.collection.comparators.BookComparator;
import com.arya.collection.set.entities.Book;

public class TreeSetDemo {

	public static void main(String[] args) {
		SortedSet<Integer> integerSet = new TreeSet<>();
		
		Integer number=10;
		Integer number2=10;
		
		integerSet.add(30);
		integerSet.add(20);
		integerSet.add(40);
		integerSet.add(10);
		System.out.println(integerSet);
		
		NavigableSet<Book> bookSet = new TreeSet<>(BookComparator.BY_PRICE_DESC);
		bookSet.add(new Book("Core Java", "ABC", 100f));
		bookSet.add(new Book("Advance Java", "BBC", 200f));
		bookSet.add(new Book("SpringBoot Java", "CBC", 300f));
		
		System.out.println(bookSet);
		
	}
}
