package com.arya.exception;

import com.arya.exception.custom.UnderAgeException;

public class ThrowDemo {

	public static void main(String[] args) throws ClassNotFoundException, UnderAgeException {
		int age=17;
		try {
			checkAge(age);
		} catch (UnderAgeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		importSqlPackage();
		
		
	}
	
	static void checkAge(int age) throws UnderAgeException {
		if(age>18)
			System.out.println("Illegible for Voting");
		else {
			// throw custom exception 
			throw new UnderAgeException("Voter age must be above 18:");
			//Unreachable code
//			System.out.println("After throw statement");
		}
	}
	
	
	static void importSqlPackage() throws ClassNotFoundException, UnderAgeException {
		
		Class.forName("com.sql.jdbc.Driver");
		throw new UnderAgeException("Under age");
	}
}
