package com.arya.typecasting.example;

public class TypeCastingExample {

	// Property
	
	byte byteVariable;
	short shortVariable;
	int intVariable;
	long longVariable;
	
	float floatVariable;
	double doubleVariable;
	
	char charVariable;
	boolean booleanVariable;
	
	//parameterized constructor
	public TypeCastingExample(byte byteVariable, short shortVariable, int intVariable,
				long longVariable, float floatVariable, double doubleVariable, 
				char charVariable, boolean booleanVariable) {
		
		this.byteVariable=byteVariable;
		this.shortVariable=shortVariable;
		this.intVariable=intVariable;
		this.longVariable=longVariable;
		this.floatVariable=floatVariable;
		this.doubleVariable=doubleVariable;
		this.charVariable=charVariable;
		this.booleanVariable=booleanVariable;
	}
	
	public void widening() {
		shortVariable = byteVariable; // byte->short
		System.out.println(shortVariable);
		
		intVariable = shortVariable;
		System.out.println(intVariable);
		
		longVariable = intVariable;
		System.out.println(longVariable);
		
		floatVariable = intVariable;
		System.out.println(floatVariable);
		
		floatVariable = longVariable; // long->float implicit typeCasting
		System.out.println(floatVariable);
		
		
		 // -> char 16bit byte 8bit; because of positive and negative number conversion cannot be implicit
//		charVariable = byteVariable;
//		
//		charVariable = shortVariable;
//		
//		charVariable = intVariable; 
		
		
		// can not convert implicitly because of size
		
//		byteVariable = charVariable;
//		
//		shortVariable = charVariable;
		
		// implicit conversion from char to int
		intVariable = charVariable;
		System.out.println(intVariable);
		
		longVariable = charVariable;
		System.out.println(longVariable);
		
		floatVariable = charVariable;
		System.out.println(floatVariable);
		
		doubleVariable = charVariable;
		System.out.println(doubleVariable);
		
		
		// can not convert to boolean or boolean to any primitive data types implicitly or explicitly
//		booleanVariable = (boolean) byteVariable;
//		
//		doubleVariable = booleanVariable;
		
	}
	
	public void narrowing() {
		byteVariable = (byte) shortVariable;
		System.out.println(byteVariable);
		
		
		longVariable = (long) floatVariable;
		System.out.println(longVariable);
		
		charVariable = (char) byteVariable;
		System.out.println(longVariable);
		
		
	}
	
	public int expressionPromotion(int intVariable) {
//		intVariable = (int) (intVariable + floatVariable);
//		
//		longVariable = shortVariable + intVariable;
		
		return (int)(intVariable + floatVariable);
	}
	
}
