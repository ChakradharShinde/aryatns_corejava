package com.arya.bookapp.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.arya.bookapp.entities.Book;

public class BookDaoImpl implements BookDao{

	@Override
	public void saveToFile(Book[] books) throws FileNotFoundException, IOException {
		try(
				FileOutputStream fileOut = 
				new FileOutputStream("d:/BookRecord.txt");
				
				ObjectOutputStream objectOutput 
					= new ObjectOutputStream(fileOut)
			)
		{
			// Serialization
			objectOutput.writeObject(books);
			
		}
		
		
		
	}

	@Override
	public Book[] readFromFile() throws FileNotFoundException, IOException, ClassNotFoundException {
		Book[] books;
		try(
				FileInputStream fileIn = 
						new FileInputStream("d:/BookRecord.txt");
				ObjectInputStream objectIn = 
						new ObjectInputStream(fileIn);
		){
			// Desrialization
			books = (Book[])objectIn.readObject();
		}
		
		return books;
	}

}
