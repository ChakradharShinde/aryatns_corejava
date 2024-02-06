package com.arya.bookapp;

import com.arya.bookapp.services.BookService;
import com.arya.bookapp.services.BookServiceImpl;

public class App {

	public static void main(String[] args) {
		int choice;
		BookService service = new BookServiceImpl();
		int index=0;
		do {
			choice = service.printMenu();
			switch(choice) {
				case 1-> service.insertRecord(index++);
				case 2-> service.updateRecord();
				case 3-> service.deleteRecord();
				case 4-> service.printRecord(index);
				case 5-> service.printAllRecord();
				case 0-> System.out.println("Exit...");
				default-> System.out.println("Invalid Input");
				
			}
		}while(choice!=0);
	}
}
