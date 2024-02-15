package com.arya.collection.maps.customobject;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

import com.arya.collection.maps.entities.Dog;

public class LinkedHashMapCutomObject {

	public static void main(String[] args) {
		Map<Dog, String> dogMap = new LinkedHashMap<>();
		
		dogMap.put(new Dog("Dog1", "3000"), "Loyal");
		dogMap.put(new Dog("Dog2", "3000"), "Brave");
		dogMap.put(new Dog("Dog3", "3000"), "Silent");
		
		System.out.println(dogMap);
		
		
		// added after java 8 Collection framework
		dogMap.forEach((k,v)->System.out.println("Key:" + k + " Value:" + v));
		
		for(Map.Entry<Dog, String> entry:dogMap.entrySet())
			System.out.println("Key: " + entry.getKey() + "value:" + entry.getValue());
		
		//Using Iterator
		// Key Set
		Iterator<Dog> dogSet = dogMap.keySet().iterator();
		while(dogSet.hasNext())
			System.out.println(dogSet.next());
		
		Iterator<String> dogPrices = dogMap.values().iterator();
		while(dogPrices.hasNext())
			System.out.println(dogPrices.next());
		
		Iterator<Map.Entry<Dog, String>> dogEntries = dogMap.entrySet().iterator();
		
		while(dogEntries.hasNext()) {
			Map.Entry<Dog, String> singleEntry = dogEntries.next();
			System.out.println(singleEntry.getKey());
			System.out.println(singleEntry.getValue());
		}
	}
}
