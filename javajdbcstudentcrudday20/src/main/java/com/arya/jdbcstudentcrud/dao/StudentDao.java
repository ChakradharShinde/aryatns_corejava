package com.arya.jdbcstudentcrud.dao;

import java.sql.SQLException;

import com.arya.jdbcstudentcrud.entities.Student;

public interface StudentDao {

	String insertStudent(Student student) throws ClassNotFoundException, SQLException;
	
	String updateStudent(Student student) throws ClassNotFoundException, SQLException;
	
	Student selectStudent(int rollNo) throws ClassNotFoundException, SQLException;
	
	String deleteStudent(int rollNo)throws ClassNotFoundException, SQLException;
	
}
