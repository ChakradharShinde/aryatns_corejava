package com.arya.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import com.arya.streamapi.entitites.Employee;

public class App {

	public static void main(String[] args) {
		List<Employee> employeeList = new ArrayList<>();
		employeeList.add(new Employee("Deepak", 21, 1000));
		employeeList.add(new Employee("Sandeep", 20, 2000));
		employeeList.add(new Employee("Atharva", 22, 1000));
		employeeList.add(new Employee("Devendra", 23, 3000));
		employeeList.add(new Employee("Vishal", 20, 4000));
		employeeList.add(new Employee("Sachin", 23, 6000));
		employeeList.add(new Employee("Krati", 21, 9000));
		employeeList.add(new Employee("Ayushi", 22, 9000));
		
		
		//Intermediate functions
		// filter
		//employeeList.stream().filter(e->e.getSalary()>2000).forEach(e->System.out.println(e));//forEach(System.out::println); 
		
		//map
		//employeeList.stream().map(e->e.getName()).forEach(System.out::println);
		
		//Function pipelining
//		employeeList.stream().map(Employee::getName)
//			.filter(s->s.length()>6).sorted().forEach(System.out::println);
		
		//sorted for custom object;
//		employeeList.stream().sorted((e1,e2)->e1.getName().compareTo(e2.getName()))
//				.forEach(e->System.out.println(e));
		
		//Limit and skip
		employeeList.stream().filter(e->e.getAge()%2==0).sorted((e1,e2)->e1.getName()
				.compareTo(e2.getName())).skip(2).forEach(System.out::println);
		
		
		//Flatmap
//		List<Integer> integerList1 = new ArrayList<>();
//				integerList1.add(1);
//				integerList1.add(3);
//				integerList1.add(2);
//		List<List<Integer>> integersList = new ArrayList<>();
//		integersList.add(integerList1);
//		integersList.add(Arrays.asList(5,4,6));
		
		
//		integersList.stream().flatMap(e->e.stream()).sorted().forEach(e->System.out.println(e));
		
		//Terminating Operation
		//reduce
		float sumOfSalaries=employeeList.stream().map(e->e.getSalary()).reduce(0f, (s1,s2)->s1.floatValue()+s2.floatValue());
		System.out.println(sumOfSalaries);
		
		
		//count
		long countOfLongNames=employeeList.stream().filter(e->e.getName().length()>6).count();
		System.out.println(countOfLongNames);
		
		//anyMatch allMatch noneMatch;
		boolean isAnyMatch = employeeList.stream().anyMatch(e->e.getSalary()>5000);
		System.out.println(isAnyMatch);
		
		//allMatch allMatch noneMatch;
		boolean isAllMatch = employeeList.stream().allMatch(e->e.getSalary()>5000);
		System.out.println(isAllMatch);
		
		//anyMatch allMatch noneMatch;
		boolean isNoneMatch = employeeList.stream().noneMatch(e->e.getSalary()>10000);
		System.out.println(isNoneMatch);
		
		
		//min max
		Optional<Employee> maxSalaryPaid=employeeList.stream().max((e1,e2)->(int)(e1.getSalary()-e2.getSalary()));
		if(maxSalaryPaid.isPresent())
			System.out.println(maxSalaryPaid);
		
		
		Optional<Employee> minAgeEmployee = employeeList.stream().min((e1,e2)->e1.getAge()-e2.getAge());
		if(minAgeEmployee.isPresent())
			System.out.println(minAgeEmployee);
		
		//findFirst
		Optional<Employee> firstEmployee=employeeList.stream().filter(e->e.getAge()>21).findFirst();
		if(firstEmployee.isPresent())
			System.out.println(firstEmployee.get());
		
		//toArray
		Employee[] emplArrayStartingCharD=employeeList.stream()
				.filter(e->e.getName().startsWith("D")).toArray(Employee[]::new);
		
		System.out.println(Arrays.toString(emplArrayStartingCharD));
		
		//primitive array pending (MapToInt)
		int[] evenAgeArray=employeeList.stream().mapToInt(e->e.getAge()).toArray();
		System.out.println(evenAgeArray);
		
		
		//collect
		//toList
	
		List<Employee> employeeListOfEvenAge=employeeList.stream().filter(e->e.getAge()%2==0).collect(Collectors.toList());
		System.out.println(employeeListOfEvenAge);
		
		
		//toSet
		Set<Employee> nameSet = employeeList.stream().filter(e->e.getName().length()>6).collect(Collectors.toSet());
		System.out.println(nameSet);
		
		//toMap
		Map<String, Integer> nameLength= employeeList.stream().collect(Collectors.toMap(e->e.getName(), e->e.getName().length()));
		System.out.println(nameLength);
	}
}
