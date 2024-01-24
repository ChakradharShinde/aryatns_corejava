package com.arya.typecasting;

import com.arya.typecasting.example.TypeCastingExample;

public class TypeCasting {

	public static void main(String[] args) {
		// Widening or implicit type casting
		
		byte byteVariable = 10;
		short shortVariable = 20;
		
		TypeCastingExample typeCast = new TypeCastingExample(byteVariable, shortVariable, 30, 40l, 50.1f, 60.2, 'A', true);
		
		typeCast.widening();
		typeCast.narrowing();
	}
}
