package com.arya.generics.sorting;

import java.util.Arrays;

import com.arya.generics.Student;

public class MainSorting {

	public static void main(String[] args) {
		Integer[] integerArray = {1,5,3,2,4};
		String[] stringArray = {"DBC", "ABC", "CBC"};
		Student[] studentArray = {new Student(3,"Student3"), new Student(1, "Student1"), new Student(2,"Student2")};
		
		Sorting<Integer> integerSorting = new Sorting<>(integerArray);
		Sorting<String> stringSorting = new Sorting<>(stringArray);
		System.out.println(Arrays.toString(integerArray));
		integerSorting.bubbleSort();
		System.out.println(Arrays.toString(integerArray));
		Sorting<Student> studentSorting = new Sorting<>(studentArray);
		System.out.println(Arrays.toString(stringArray));
		stringSorting.bubbleSort();
		System.out.println(Arrays.toString(stringArray));
		
		System.out.println(Arrays.toString(studentArray));
		studentSorting.bubbleSort();
		System.out.println(Arrays.toString(studentArray));
	}
}
