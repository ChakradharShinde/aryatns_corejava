package com.arya.jdbcstudentcrud.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.arya.jdbcstudentcrud.entities.Student;

public class StudentDaoImpl implements StudentDao{
	
	private String query;

	private Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/demodb", "root", "root");
	}
	
	
	@Override
	public String insertStudent(Student student) throws ClassNotFoundException, SQLException {
		query = "INSERT INTO student(name,phone) VALUES(?,?)";
		try(
				Connection connection = getConnection();
				PreparedStatement statement = connection.prepareStatement(query);
			){
		
			statement.setString(1, student.getName());
			statement.setString(2, student.getPhoneNo());
			statement.execute();
			return "Inserted Successfully..";
		}
		
//		return "Problem occured while inserting record.";
	}

	@Override
	public String updateStudent(Student student) throws ClassNotFoundException, SQLException {
		query = "UPDATE student SET name=?, phone=? WHERE rollNo=?";
		try(
				Connection connection = getConnection();
				PreparedStatement statement = connection.prepareStatement(query);
			){
		
			statement.setString(1, student.getName());
			statement.setString(2, student.getPhoneNo());
			statement.setInt(3, student.getRollNo());
			statement.execute();
			return "Inserted Successfully..";
		}
	}

	@Override
	public Student selectStudent(int rollNo) throws ClassNotFoundException, SQLException {
		query = "SELECT * FROM student WHERE rollNo=?";
		try(
				Connection connection = getConnection();
				PreparedStatement statement = connection.prepareStatement(query);
			){
		
			Student student = new Student();
			statement.setInt(1, rollNo);
			
//			statement.execute();
			ResultSet result = statement.executeQuery();
			while(result.next()) {
				student.setRollNo(result.getInt(1));
				student.setName(result.getString(2));
				student.setPhoneNo(result.getString(3));
			}
				
			return student;
			
		}
	}

	@Override
	public String deleteStudent(int rollNo) throws ClassNotFoundException, SQLException {
		query = "DELETE FROM student WHERE rollNo=?";
		try(
				Connection connection = getConnection();
				PreparedStatement statement = connection.prepareStatement(query);
			){
		
			statement.setInt(1, rollNo);
			
			statement.execute();
			return "Inserted Successfully..";
		}
	}

}
