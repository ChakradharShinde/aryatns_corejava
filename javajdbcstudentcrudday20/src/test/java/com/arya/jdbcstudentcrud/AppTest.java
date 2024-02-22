package com.arya.jdbcstudentcrud;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIf;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import com.arya.jdbcstudentcrud.entities.Student;
import com.arya.jdbcstudentcrud.service.StudentService;
import com.arya.jdbcstudentcrud.service.StudentServiceImpl;

class AppTest {
	
	Student student1;
	
	
	@BeforeAll
	static void showMessage() {
		System.out.println("Hi");
	}
	
	@BeforeEach
	void printMethodCount() {
//		student = new Student(0,"ABC","123678235");
	}
	
   
	@ParameterizedTest
	@ValueSource(strings= {"Abc abc","abc abc","abc Abc"})
	@DisplayName("insertStudent function Test Case")
	void shouldReturnString(String name) {
		Student student = new Student(0,"acc","12312");
		StudentService service = new StudentServiceImpl();
//		assertThrows(RuntimeException.class, ()->service.insertStudent(student));
		assertEquals("Name should follow [A-Z][a-z]+[ ]+[A-Z][a-z]+", service.insertStudent(student));
		student = new Student(0, name, "123890");
		assertEquals("Name should follow [A-Z][a-z]+[ ]+[A-Z][a-z]+", service.insertStudent(student));
	}
	
	@Test
	@DisplayName("insertStudent fucntion test for Exception")
	@Disabled
	void shouldReturnExceptionWithNullProperties() {
		StudentService service = new StudentServiceImpl();
		Student student = new Student(0, null, "1235456098");
		assertThrows(RuntimeException.class, ()->service.insertStudent(student));
		assertFalse(student.getRollNo()>0);
		assertTrue(student.getRollNo()>=0);
	}
	
	
	@AfterAll
	static void sayBye() {
		System.out.println("Bye..");
	}
	
	@ParameterizedTest
	@MethodSource("getStudentList")
	void testStudentObjects(Student student) {
		StudentService service = new StudentServiceImpl();
//		assertEqual("Name should follow [A-Z][a-z]+[ ]+[A-Z][a-z]+", 
//				service.insertStudent(student));
		assertEquals("Name should follow [A-Z][a-z]+[ ]+[A-Z][a-z]+", service.insertStudent(student));
	}
	
	
	static List<Student> getStudentList(){
		List<Student> studentList = new ArrayList<>();
		studentList.add(new Student(0,"abc abc", "123456789"));
		studentList.add(new Student(0,"abc Abc", "123456789"));
		studentList.add(new Student(0,"Abc abc", "123456789"));
		return studentList;
	}
	
	@Test
	@DisabledIf("isNullObject")
	void disabledTestOnNullObject() {
		
	}
	
	
	boolean isNullObject() {
//		if(student1==null)
//			return true;
//		else
//			return false;
		return (student1==null);
	}
	
	
	@Test
	void shouldReturnSuccessMessage() {
		StudentService service = new StudentServiceImpl();
		student1=new Student(0,"Akshat Shrivastav","7654321890");
		assertEquals("Inserted Successfully..", service.insertStudent(student1));
	}
}
