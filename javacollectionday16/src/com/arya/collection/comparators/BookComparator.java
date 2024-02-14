package com.arya.collection.comparators;

import java.util.Comparator;

import com.arya.collection.set.entities.Book;

public class BookComparator {

	public static final Comparator<Book> BY_NAME_ASC = 
			(book1,book2)-> book1.getName().compareTo(book2.getName());
			
	public static final Comparator<Book> BY_NAME_DESC = 
			(book1, book2) -> book2.getName().compareTo(book1.getName());
			
	public static final Comparator<Book> BY_PRICE_ASC = 
			(book1, book2) -> (int) (book1.getPrice()-book2.getPrice());
			
	public static final Comparator<Book> BY_PRICE_DESC = 
			(book1, book2) -> (int) (book2.getPrice()-book1.getPrice());
}
