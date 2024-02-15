package com.arya.collection.maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		Map<String, Integer> wordCount = new LinkedHashMap<>();
		
		// Insertion order preserved 
		// Duplicates not allowed or will be replaces with last record with same key
		// only single key as null is Allowed
		wordCount.put("Hello", 1);
		wordCount.put("There", 2);
		wordCount.put("Hi", 3);
		
		System.out.println(wordCount);
		
		
		
	}
}
