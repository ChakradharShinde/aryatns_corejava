package com.arya.jdbcstudentcrud.utility;

import java.util.Scanner;

import com.arya.jdbcstudentcrud.entities.Student;
import com.arya.jdbcstudentcrud.service.StudentService;
import com.arya.jdbcstudentcrud.service.StudentServiceImpl;

public class StudentUtilityImpl implements StudentUtility {

	StudentService service = new StudentServiceImpl();

	@Override
	public void addStudent(Scanner scanner) {
		Student student = new Student();

		System.out.println("Enter name of Student:");
		scanner.nextLine();
		student.setName(scanner.nextLine());
		System.out.println("Enter Phone Number:");
		student.setPhoneNo(scanner.next());

		String msg = service.insertStudent(student);
		System.out.println(msg);

	}

	@Override
	public void updateStudent(Scanner scanner) {
		System.out.println("Enter Roll No:");
		Student student = service.selectStudent(scanner.nextInt());
		
		scanner.nextLine();
		System.out.println("Enter new Name for student:");
		student.setName(scanner.nextLine());
		System.out.println("Enter new Phone for Student:");
		student.setPhoneNo(scanner.next());

		String msg = service.updateStudent(student);
		System.out.println(msg);
	}

	@Override
	public void deleteStudent(Scanner scanner) {
		System.out.println("Enter Roll no to delete a Record;");
		String msg = service.deleteStudent(scanner.nextInt());
		System.out.println(msg);
	}

	@Override
	public void selectStudent(Scanner scanner) {
		System.out.println("Enter Roll No to Select a record:");
		Student student = service.selectStudent(scanner.nextInt());
		if(student.getRollNo()==0)
			System.out.println("Record Not Found");
		else
			System.out.println(student);
	}


	@Override
	public int showMenu(Scanner scanner) {
		System.out.println("1. Create");
		System.out.println("2. Read");
		System.out.println("3. Update");
		System.out.println("4. Delete");
		System.out.println("0. Exit");
		return scanner.nextInt();
	}

}
