package com.arya.jdbcstudentcrud.service;

import com.arya.jdbcstudentcrud.entities.Student;

public interface StudentService {

	String insertStudent(Student student);
	
	String updateStudent(Student student);
	
	String deleteStudent(int rollNo);
	
	Student selectStudent(int rollNo);
}
