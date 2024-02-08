package com.arya.bookapp.services;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.arya.bookapp.App;
import com.arya.bookapp.dao.BookDao;
import com.arya.bookapp.dao.BookDaoImpl;
import com.arya.bookapp.entities.Book;

public class BookServiceImpl implements BookService {
	
	BookDao bookDao;
	Book[] books;
	Scanner scanner;
	
	public BookServiceImpl() {
		super();
		this.scanner = new Scanner(System.in);
		bookDao = new BookDaoImpl();
//		books = new Book[10];
		try {
			books = bookDao.readFromFile();
		} catch (ClassNotFoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(books==null) {
			System.out.println("Enter Size of Array:");
			books = new Book[scanner.nextInt()];
		}else{
			for(int i=0;i<books.length;i++)
				if(books[i]!=null)
					App.index++;
		}
	}

	@Override
	public int printMenu() {
		System.out.println("1. Insert Book Record");
		System.out.println("2. Update Book Record");
		System.out.println("3. Delete Book Record");
		System.out.println("4. Print Book Record");
		System.out.println("5. Print All Book Record");
		System.out.println("6. Save Record to file..");
		System.out.println("0. Exit Program");
		return scanner.nextInt();
	}

	@Override
	public void insertRecord() {
		int index=App.index;
		books[index] = new Book();
		try {
			System.out.println("Enter Book Id:");
			int id = scanner.nextInt();
			if(id>0)
				books[index].setId(id);
			else
				throw new InputMismatchException();
			scanner.nextLine();
			System.out.println("Enter Book Name:");
			books[index].setName(scanner.nextLine());
			System.out.println("Enter Book Price:");
			books[index].setPrice(scanner.nextFloat());
			App.index++;
		}catch(InputMismatchException e){
			System.out.println(e);
			System.out.println("Invalid Data..");
			scanner.nextLine();	
		}
		
		
	}

	@Override
	public void deleteRecord() {
		
		System.out.println("Enter Book Id to Delete A Record:");
		int id= scanner.nextInt();
		for(int i=0;i<=App.index;i++) {
			int j=0;
			if(books[i]!=null && books[i].getId()==id) {
//				books[i]=null;
				for(j=i;j<App.index-1;j++)
					books[j]=books[j+1];
				books[j]=null;
				
				App.index--;
			}
		}
		
	}

	@Override
	public void updateRecord() {
		
		System.out.println("Enter Book id to Update the record:");
		int id = scanner.nextInt();
		for(int i=0;i<=App.index;i++)
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
	public void printRecord() {
		
		System.out.println("Enter an Id to Print a Record:");
//		for(Book book:books)
//			if(book!=null && book.getId()==id)
//				System.out.println(book);
		int id=0;
		try {
			id=scanner.nextInt();
		}catch(InputMismatchException e) {
			System.out.println(e);
//			System.out.println("Invalid Id:");
			id=0;
			scanner.nextLine();
		}
		if(id>0) {
			boolean found=false;
			for(int i=0;i<App.index;i++)
				if(books[i].getId()==id) {
					System.out.println(books[i]);
					found=true;
				}

			if(!found)
				System.out.println("Record not found for Id:" + id);
		}
		else
			System.out.println("Invalid Id");
	}

	@Override
	public void printAllRecord() {
//		for(Book book:books)
//			System.out.println(book);
		
		for(int i=0;i<App.index;i++)
			System.out.println(books[i]);
			
	}
	
	public void saveBooks() {
		try {
			bookDao.saveToFile(books);
			System.out.println("record saved successfully...");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
