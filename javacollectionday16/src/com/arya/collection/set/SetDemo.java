package com.arya.collection.set;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		Set<Integer> integerSet = new HashSet<>();
		// Insertion order not preserved, Duplicates not Allowed, Only One null value is Allowed
		integerSet.add(40);
		integerSet.add(30);
		integerSet.add(33);
		integerSet.add(31);
		integerSet.add(31);
		integerSet.add(null);
		integerSet.add(null);
		
		
		// toString method of Object class prints hashCode to the console
		Integer[] number= {10};
		System.out.println(number);
		
		System.out.println(integerSet);
		
	}
}
