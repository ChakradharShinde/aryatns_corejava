package com.arya.collection.hashset;

import java.util.HashSet;
import java.util.Set;

import com.arya.collection.set.entities.Employee;

public class HashSetDemo {

	public static void main(String[] args) {
		Set<Employee> employeeSet = new HashSet<>();
		Employee employee1= new Employee(1,"EMP1",32);
		Employee employee2= new Employee(2,"EMP1",32);
		Employee employee3 = employee1;
		employeeSet.add(employee1);
		employeeSet.add(employee2);
		employeeSet.add(employee3);
		System.out.println(employee1.hashCode());
		System.out.println(employee2.hashCode());
		System.out.println(employee3.hashCode());
		System.out.println(employeeSet);
		
		System.out.println(employee1.equals(employee2));
		
		System.out.println(employee1.equals(employee3));
		
		System.out.println(employeeSet.contains
				(new Employee(1,"EMP1",32)));
	}
}
