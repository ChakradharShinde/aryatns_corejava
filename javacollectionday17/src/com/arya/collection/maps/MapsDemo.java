package com.arya.collection.maps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class MapsDemo {

	
	
	public static void main(String[] args) {
	
		HashMap<Long, String> phoneBook = new HashMap<>();
		
		Long number1=2408976549l;
		Long number2=2408976545l;
		Long number3=2408976547l;
		Long number4=2408976548l;
		
		System.out.println(number1.hashCode());
		System.out.println(number2.hashCode());
		System.out.println(number3.hashCode());
		System.out.println(number4.hashCode());
		
		
		//Insertion order not preserved for HashMap
		//Duplicates Not Allow or Last Entry will be replace with previous entry with same key
		phoneBook.put(null, "Divyansh");
		phoneBook.put(2408976549l, "Divyansh");
		phoneBook.put(2408976545l, "Sumesh");
		phoneBook.put(2408976547l, "Ankit");
		phoneBook.put(2408976548l, "Devendra");
		phoneBook.put(2408976548l, "Sachin");
//		phoneBook.put(null, null);
		
		System.out.println(phoneBook);
		
		boolean isPresent = phoneBook.containsKey(2408976549l);
		System.out.println(isPresent);
		
		List<Map.Entry<Long, String>> hashMapList = new ArrayList<>(phoneBook.entrySet());
//		hashMapList.add(phoneBook);
		Collections.sort(hashMapList, (e1, e2)->e1.getValue().compareTo(e2.getValue()));
		System.out.println(hashMapList);
		
		
		
	}
}
