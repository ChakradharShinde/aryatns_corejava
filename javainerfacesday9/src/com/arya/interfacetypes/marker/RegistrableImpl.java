package com.arya.interfacetypes.marker;

public class RegistrableImpl {

	public static RegistrableImpl getInstance(Student student) {
		if(student instanceof Registrable)
			return new RegistrableImpl();
		else
			return null;
	}
	
	public void registerStudent() {
		System.out.println("Add Student");
	}
}
