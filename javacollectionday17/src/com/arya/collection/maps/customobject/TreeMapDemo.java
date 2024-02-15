package com.arya.collection.maps.customobject;

import java.util.NavigableMap;
import java.util.TreeMap;

import com.arya.collection.maps.comparators.CatCompartor;
import com.arya.collection.maps.entities.Cat;

public class TreeMapDemo {

	public static void main(String[] args) {
		NavigableMap<Integer, String> studentMap = new TreeMap<>();
		studentMap.put(3, "ABC");
		studentMap.put(1, "ABC");
		studentMap.put(2, "ABC");
		System.out.println(studentMap);
		
//		studentMap.tailMap(null);
		
		NavigableMap<Cat, Integer> catInventory = new TreeMap<>(CatCompartor.BY_PRICE);
		catInventory.put(new Cat("Cat1", 4000), 3);
		catInventory.put(new Cat("Cat2", 2000), 2);
		catInventory.put(new Cat("Cat3", 1000), 1);
		
		System.out.println(catInventory);
		
	}
}
