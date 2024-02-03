package com.arya.interfacetypes;

import com.arya.interfacetypes.marker.RegistrableImpl;
import com.arya.interfacetypes.marker.Student;

public class MarkerInterfaceApp {

	public static void main(String[] args) {
		Student student1 = new Student();
		RegistrableImpl registration = RegistrableImpl.getInstance(student1);
		registration.registerStudent();
	}
}
