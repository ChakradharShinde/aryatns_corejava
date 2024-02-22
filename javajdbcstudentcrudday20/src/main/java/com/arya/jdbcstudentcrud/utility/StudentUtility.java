package com.arya.jdbcstudentcrud.utility;

import java.util.Scanner;

public interface StudentUtility {
	
	int showMenu(Scanner scanner);

	void addStudent(Scanner scanner);
	
	void updateStudent(Scanner scanner);
	
	void deleteStudent(Scanner scanner);
	
	void selectStudent(Scanner scanner);
}
