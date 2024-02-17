package com.arya.generics;

public class GenericsDemo {

	public static void main(String[] args) {
//		PrintInteger printInteger = new PrintInteger(10);
//		System.out.println(printInteger);
//		
//		PrintString printString = new PrintString("Hello");
//		System.out.println(printString);
//		
//		Student student = new Student(1,"ABC");
//		PrintStudent printStudent = new PrintStudent(student);
//		printStudent.printStudent(student);
		
		GenericClass<Integer> integerPrint = new GenericClass<>(10);
		// Type Safety
//		integerPrint.printObject("ABC");
		//no explicit casting is needed

		int number=integerPrint.getObj();
		
		GenericClass<String> stringPrint = new GenericClass<>("ABC");
		stringPrint.printObject("BBC");
		String message=stringPrint.getObj();
		
		GenericClass<Student> studentPrint = new GenericClass<>(new Student(1,"Student1"));
		studentPrint.printObject(new Student(1,"Student1"));
		Student student1=studentPrint.getObj();
	}
}
