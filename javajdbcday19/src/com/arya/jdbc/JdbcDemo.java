package com.arya.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.arya.jdbc.entities.Student;

public class JdbcDemo {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/demodb";
		String userName = "root";
		String password="root";
		// sun.jdbc.odbc.JDBCODBCDriver; JDBC ODBC bridge Drivers
		// oracle.jdbc.OracleDriver // Native Drivers
		// com.ibm.db2.jdbc.net.DB2Driver // network Api Drivers
		// com.mysql.cj.jdbc.Driver; // Thin Driver or Direct 2 Database Drivers
		
		try {
			// Loading class into JVM
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Student student = new Student(2, "Akhand", (byte)23);
			
			Connection connection = 
					DriverManager.getConnection(url, userName, password);
//			PreparedStatement statement = 
//					connection.prepareStatement("INSERT INTO student(id,name,age) values(?,?,?)");
//			statement.setInt(1, student.getId());
//			statement.setString(2, student.getName());
//			statement.setByte(3, student.getAge());
//			statement.execute();
//			List<Student> studentList = new ArrayList<>();
//			PreparedStatement statement = 
//					connection.prepareStatement("SELECT * FROM student");
//			ResultSet studentRecords=statement.executeQuery();
//			while(studentRecords.next()) {
//				studentList.add(new Student(
//						studentRecords.getInt(1),
//						studentRecords.getString(2),
//						studentRecords.getByte(3)
//				));
//			}
//			
//			System.out.println(studentList);
			
			
			CallableStatement statement = connection.prepareCall("call delte_student(?)");
			
			statement.setInt(1, 3);
			
			statement.execute();
			
			System.out.println("Deleted Successfully..");
			
			
//			System.out.println("Record Inserted Successfully");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("Problem Occured while deleting record..");
			e.printStackTrace();
		}
	
	}
}
