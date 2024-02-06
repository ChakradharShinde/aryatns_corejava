package com.arya.customexception;

import com.arya.customexception.entities.Student;
import com.arya.customexception.exceptions.InvalidIdException;
import com.arya.customexception.exceptions.RecordNotFoundException;

public class CustomExceptionDemo {

	public static void main(String[] args) {
//		int[] arrId = {1,2,3,4,5};//new int[5];
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Enter ID: ");
//		int id = scanner.nextInt();
//		System.out.println(arrId[id]);
		Student[] studentArray = new Student[3];
		studentArray[0] = new Student(1,"XYZ", 20);
		
//		String name = studentArray[0].getName();
//		System.out.println(name);
//		
//		String name1=studentArray[1].getName();
		
		try {
			printRecord(1, studentArray);
		} catch (RecordNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		getRecordWithId(-1, studentArray);
	}
	
	
	static void printRecord(int index, Student[] students) throws RecordNotFoundException {
		try {
			System.out.println(students[index].getName());
		} catch (NullPointerException e) {
			throw new RecordNotFoundException("Record with Index:" + index + " not found", e);
		}
	}
	
	static void getRecordWithId(int id, Student[] students) {
		if(id<0)
			throw new InvalidIdException("Id is Negative");
		else
			System.out.println(students[id]);
	}
}
