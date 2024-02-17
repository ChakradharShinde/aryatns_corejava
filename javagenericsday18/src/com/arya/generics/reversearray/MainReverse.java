package com.arya.generics.reversearray;

import java.util.Arrays;

import com.arya.generics.Student;

public class MainReverse {

	public static void main(String[] args) {
		Integer[] intArray = new Integer[] {1,2,3,4,5};
		System.out.println(Arrays.toString(intArray));
		ReverseArray<Integer> integerArray = 
				new ReverseArray<>(intArray);
		integerArray.reverse();
		System.out.println(Arrays.toString(intArray));
		
		String[] strArray = new String[] {"Arvind", "Nikhil", "Akhilesh", "Imteyaj"};
		ReverseArray<String> stringArray = 
				new ReverseArray<>(strArray);
		System.out.println(Arrays.toString(strArray));
		stringArray.reverse();
		System.out.println(Arrays.toString(strArray));
		
		Student[] studArray = new Student[] {new Student(1,"Student1"), new Student(2,"Student2"), new Student(3,"Student3")};
		ReverseArray<Student> studentArray = new ReverseArray<>(studArray);
		System.out.println(Arrays.toString(studArray));
		studentArray.reverse();
		System.out.println(Arrays.toString(studArray));
	}
}
