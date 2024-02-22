package com.arya.lambda;

import java.util.Stack;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import com.arya.lambda.entities.Employee;



public class LambdaDemo {
	
	static Stack<Employee> employeeStack;

	public static void main(String[] args) {
		//Predicate  // 
		//Function
		//Consumer
		//Supplier
		
//		Predicate<Integer> predicate = 
//				number-> number>18;
//				
//		if(predicate.test(10))
//			System.out.println("10 is Greater Than 18");
//		else
//			System.out.println("10 is Smaller Than 18");
		
//		Predicate<Employee> employeePredicate = employee->employee.getSalary()>3000f;
		
//		Predicate<Employee> employeePredicate = employee->LambdaDemo.testSalary(employee);
		// Method refrencing
		Predicate<Employee> employeePredicate = LambdaDemo::testSalary;
		
		
//		Predicate<Employee> employeeNamePredicate = ;
		
		
//		Consumer<Employee> employeeConsumer = employee-> employeeStack.push(employee);
//		
//		Supplier<Employee> employeeSupplier = ()-> employeeStack.pop();

		Consumer<Employee> employeeConsumer = LambdaDemo::consumeEmployee;
		
		Supplier<Employee> employeeSupplier = LambdaDemo::supplyEmployee;
		
		
		employeeStack = new Stack<>();
		
		employeeConsumer.accept(new Employee(1,"EMP1231", 1000f));
		employeeConsumer.accept(new Employee(2,"EMP1232", 2000f));
		employeeConsumer.accept(new Employee(3,"EMP1233", 3000f));
		employeeConsumer.accept(new Employee(4,"EMP1234", 4000f));
		employeeConsumer.accept(new Employee(5,"EMP1235", 5000f));
		
		System.out.println(employeeSupplier.get());
		System.out.println(employeeSupplier.get());
		System.out.println(employeeSupplier.get());
		System.out.println(employeeSupplier.get());
		System.out.println(employeeSupplier.get());
		
		
		
//		employeeStack.add(new Employee(1,"EMP123", 1000f));
//		employeeStack.add(new Employee(3,"EMP3", 3000f));
//		employeeStack.add(new Employee(5,"EMP5345", 5000f));
//		employeeStack.add(new Employee(7,"EMP7", 7000f));
		
		
		
		for(Employee employee:employeeStack)
			if(employeePredicate.test(employee))
				System.out.println(employee);
		
		
		
		
//		Consumer<Employee> employeeConsumer = ()->new Employee(1,"Emp6",8000f); 
		
//		Consumer<Employee> employeeConsumer = emp->System.out.println(emp.getSalary());
//		
//		for(Employee emp:employeeStack)
//			employeeConsumer.accept(emp);
		
		
		
		
//		Function<String, Integer> stringFunction = String::length;
		Function<String, Integer> stringFucntion = str->str.length();
		
//		Fucntion<Boolean, Integer> integerFunction
		
		int length=stringFucntion.apply("Deepak");
		System.out.println(length);
	}
	
	static void consumeEmployee(Employee employee) {
		employeeStack.push(employee);
	}
	
	static Employee supplyEmployee() {
		return employeeStack.pop();
	}
	
	static boolean testSalary(Employee employee) {
		return employee.getSalary()>3000f;
	}
}
