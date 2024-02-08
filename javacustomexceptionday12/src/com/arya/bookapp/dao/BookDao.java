package com.arya.bookapp.dao;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.arya.bookapp.entities.Book;

public interface BookDao {

	//public abstract
	void saveToFile(Book[] books) throws FileNotFoundException, IOException;
	
	Book[] readFromFile() throws FileNotFoundException, IOException, ClassNotFoundException;
}
