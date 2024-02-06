package com.arya.bookapp.services;

import java.util.Scanner;

import com.arya.bookapp.entities.Book;

public class BookServiceImpl implements BookService {
	
	Book[] books;
	Scanner scanner;
	
	public BookServiceImpl() {
		super();
		this.scanner = new Scanner(System.in);
//		books = new Book[10];
		System.out.println("Enter Size of Array:");
		books = new Book[scanner.nextInt()];
	}

	@Override
	public int printMenu() {
		System.out.println("1. Insert Book Record");
		System.out.println("2. Update Book Record");
		System.out.println("3. Delete Book Record");
		System.out.println("4. Print Book Record");
		System.out.println("5. Print All Book Record");
		System.out.println("0. Exit Program");
		return scanner.nextInt();
	}

	@Override
	public void insertRecord(int index) {
		books[index] = new Book();
		System.out.println("Enter Book Id:");
		books[index].setId(scanner.nextInt());
		scanner.nextLine();
		System.out.println("Enter Book Name:");
		books[index].setName(scanner.nextLine());
		System.out.println("Enter Book Price:");
		books[index].setPrice(scanner.nextFloat());
		
	}

	@Override
	public void deleteRecord() {
		
		System.out.println("Enter Book Id to Delete A Record:");
		int id= scanner.nextInt();
		for(int i=0;i<books.length;i++) {
			int j=0;
			if(books[i]!=null && books[i].getId()==id) {
//				books[i]=null;
				for(j=i;j<books.length-1;j++)
					books[j]=books[j+1];
				books[j]=null;
			}
		}
		
	}

	@Override
	public void updateRecord() {
		
		System.out.println("Enter Book id to Update the record:");
		int id = scanner.nextInt();
		for(int i=0;i<books.length;i++)
			if(books[i]!=null && books[i].getId()==id ) {
				System.out.println(books[i]);
				scanner.nextLine();
				System.out.println("Enter new Book Name:");
				books[i].setName(scanner.nextLine());
				System.out.println("Enter new Book Price:");
				books[i].setPrice(scanner.nextFloat());
			}
				
	}

	@Override
	public void printRecord(int id) {
		for(Book book:books)
			if(book!=null && book.getId()==id)
				System.out.println(book);
	}

	@Override
	public void printAllRecord() {
		for(Book book:books)
			System.out.println(book);
	}

}
