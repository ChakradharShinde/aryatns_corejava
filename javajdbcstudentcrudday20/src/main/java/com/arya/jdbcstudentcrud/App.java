package com.arya.jdbcstudentcrud;

import java.util.Scanner;

import com.arya.jdbcstudentcrud.utility.StudentUtility;
import com.arya.jdbcstudentcrud.utility.StudentUtilityImpl;

public class App {
	public static void main(String[] args) {
		StudentUtility utility = new StudentUtilityImpl();

		try (Scanner scanner = new Scanner(System.in)) {
			// utility.addStudent(scanner);
			// utility.selectStudent(scanner);
			// utility.updateStudent(scanner);
			int choice = 0;
			do {
				choice = utility.showMenu(scanner);
				switch (choice) {
				case 1 -> utility.addStudent(scanner);
				case 2 -> utility.selectStudent(scanner);
				case 3 -> utility.updateStudent(scanner);
				case 4 -> utility.deleteStudent(scanner);
				case 0 -> System.out.println("Bye..");
				default -> System.out.println("Invalid Input");
				}
			} while (choice != 0);
		}
	}
}
