package com.arya.collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

import com.arya.collection.comparators.DogNameComparator;
import com.arya.collection.comparators.DogPriceComparator;
import com.arya.collection.entities.Dog;
import com.arya.collection.entities.Student;

//class Student{
//	int rollNo;
//	String name;
//	public Student(int rollNo, String name) {
//		super();
//		this.rollNo = rollNo;
//		this.name = name;
//	}
//	
//	public int getRollNo() {
//		return rollNo;
//	}
//
//
//	public void setRollNo(int rollNo) {
//		this.rollNo = rollNo;
//	}
//
//
//
//	public String getName() {
//		return name;
//	}
//
//
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//
//
//	@Override
//	public String toString() {
//		return "Student [rollNo=" + rollNo + ", name=" + name + "]";
//	}
//	
//}


public class ArrayListDemo {

	public static void main(String[] args) {
		List objectList = new ArrayList<>();
		//Hetrogenous data.
		objectList.add(1);
		objectList.add("ABC");
		objectList.add(new Student(1,"ABC"));
		
		System.out.println(objectList);
		
		
		
		Student student1 = (Student)objectList.get(2);
		System.out.println(student1);
		
		
		List<Integer> linkedList = new LinkedList<Integer>();
		List<Integer> linkedList1 = new LinkedList<Integer>();
		linkedList.add(10);
		linkedList.add(20);
		linkedList.add(30);
		linkedList.add(40);
//		int number=linkedList.get(0);
		
		linkedList1.add(30);
		linkedList1.add(40);
		
		linkedList.retainAll(linkedList1);
		System.out.println(linkedList);
		
		List<Student> studentList = new ArrayList<Student>();
		
		int size=studentList.size();
		System.out.println(size);
		
		studentList.add(new Student(1,"ABC"));
		studentList.add(new Student(2,"BBC"));
		studentList.add(new Student(3,"CBC"));
		studentList.add(new Student(4,"DBC"));
		
		studentList.set(2, new Student(33, "CCBC"));
		
		System.out.println(studentList);
		
		
		Iterator<Student> studentIterator = studentList.iterator();
		while(studentIterator.hasNext())
			System.out.println(studentIterator.next());
		
		
		for(Student student:studentList) {
			if(student.getRollNo()==33) {
				student.setRollNo(3);
				student.setName("CBC");
			}
			System.out.println(student);
		}
		
		studentList.forEach(e->System.out.println(e));
		
		studentList.forEach(System.out::println);
		
		
		Stack<Student> studentStack = new Stack<Student>();
		
		int i=0;
		for(Student student:studentList) {
			studentStack.push(student);
		}
		
		System.out.println("Stack"  + studentStack);
		studentList.removeAll(studentList);
		Iterator<Student> studentIterator1 = studentStack.iterator();
		while(studentIterator1.hasNext()) {
			studentList.add(studentStack.pop());
			System.out.println(studentList.get(i++));
		}
		
		System.out.println(studentList);
		
		Collections.sort(studentList);
		
		System.out.println("After Sort:" + studentList);
		
		//Collection
		
		//Early version syntax
//		List<Integer> integerList = new ArrayList<Integer>();
	
		// Newer version syntax
		List<Integer> integerList = new ArrayList<>();
		
		integerList.add(4);
		integerList.add(2);
		integerList.add(1);
		System.out.println(integerList);
		
		Collections.sort(integerList);
		
		System.out.println(integerList);
		
//		System.out.println("Stack " + studentStack);
		
		
		List<Dog> dogList = new LinkedList<>();
		dogList.add(new Dog("German Sheferd", "Herding", 10000f));
		dogList.add(new Dog("Hunter", "Hunting", 15000f));
		dogList.add(new Dog("Doberman", "Loyal", 16000f));
		
//		Comparator<Dog> byDogName = new Comparator<Dog>() {
//			@Override
//			public int compare(Dog dog1, Dog dog2) {	
//				return dog1.getName().compareTo(dog2.getName());
//			}
//		};
		
		Comparator<Dog> byDogName = (dog1, dog2)-> {
				return dog1.getName().compareTo(dog2.getName());
			};
		
//		Collections.sort(dogList,new DogNameComparator());
		Collections.sort(dogList,byDogName);
		System.out.println("Sorted by Name:" + dogList);
		
//		Collections.sort(dogList, new DogPriceComparator());
		Collections.sort(dogList, (dog1, dog2)-> 
			 (int) (dog1.getPrice()-dog2.getPrice()));
		System.out.println("Sorted By Price:" + dogList);
				
	}
}
