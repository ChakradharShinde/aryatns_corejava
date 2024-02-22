package com.arya.jdbcstudentcrud.service;

import java.sql.SQLException;

import com.arya.jdbcstudentcrud.dao.StudentDao;
import com.arya.jdbcstudentcrud.dao.StudentDaoImpl;
import com.arya.jdbcstudentcrud.entities.Student;

public class StudentServiceImpl implements StudentService{

	StudentDao studentDao = new StudentDaoImpl();
	
	@Override
	public String insertStudent(Student student) {
		
		try {
			return validate(student, "Insert");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			return "Problem occured durint inserting record.";
		} 
		
	}

	@Override
	public String updateStudent(Student student) {
		try {
			return validate(student, "Update");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			return "Problem occured durint updating record.";
		} 
	}

	@Override
	public String deleteStudent(int rollNo) {
		try {
			return studentDao.deleteStudent(rollNo);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			return "Problem occured durint deleting record.";
		} 
	}

	@Override
	public Student selectStudent(int rollNo) {
		try {
			return studentDao.selectStudent(rollNo);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			return null;
		} 
	}
	
	public String validate(Student student, String choice) throws ClassNotFoundException, SQLException {
		if(!student.getName().matches("[A-Z][a-z]+[ ]+[A-Z][a-z]+"))
			return "Name should follow [A-Z][a-z]+[ ]+[A-Z][a-z]+";
		if(!student.getPhoneNo().matches("[6-9][\\d]{9}"))
			return studentDao.insertStudent(student);
		
		if(choice.equals("Insert"))
			return studentDao.insertStudent(student);
		else
			return studentDao.updateStudent(student);
	}

}
