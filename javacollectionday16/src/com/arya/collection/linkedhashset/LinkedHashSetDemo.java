package com.arya.collection.linkedhashset;

import java.util.LinkedHashSet;
import java.util.Set;

import com.arya.collection.set.entities.Employee;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		Set<Integer> integerSet = new LinkedHashSet<>();
		integerSet.add(40);
		integerSet.add(20);
		integerSet.add(50);
		integerSet.add(20);
		integerSet.add(null);
		integerSet.add(null);
		System.out.println(integerSet);
		
		
		Set<Employee> employeeSet = new LinkedHashSet<>();
		
		employeeSet.add(new Employee(1,"EMP1", 32));
		employeeSet.add(new Employee(2,"EMP3", 31));
		employeeSet.add(new Employee(3,"EMP3", 34));
		employeeSet.add(new Employee(1,"EMP1", 32));
		employeeSet.add(new Employee(4,"EMP4", 35));
		employeeSet.add(null);
		employeeSet.add(null);
		System.out.println(employeeSet);
		
	}
}
