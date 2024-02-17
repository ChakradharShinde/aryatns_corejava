package com.arya.generics.reversearray;

import java.util.Arrays;

import com.arya.generics.Student;

public class GenericMethod {

	public static void main(String[] args) {
		Integer[] integerArray = {1,2,3,4,5};
		String[] stringArray = {"ABC", "BBC", "DBC"};
		Student[] studentArray = {new Student(1,"Student1"), new Student(2, "Student2"), new Student(3,"Student3")};
		
		printArray(integerArray);
		printArray(stringArray);
		printArray(studentArray);	
	}
	
	// Place holder should be defined before return type
	public static <T> void printArray(T[] objArray) {
		System.out.println(Arrays.toString(objArray));
	}
}
