package com.arya.bookapp.services;

public interface BookService {

	int printMenu();
	
	void insertRecord(int index);
	
	void deleteRecord();
	
	void updateRecord();
	
	void printRecord(int id);
	
	void printAllRecord();
}
