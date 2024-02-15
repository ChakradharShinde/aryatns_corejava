package com.arya.collection.maps.comparators;

import java.util.Comparator;

import com.arya.collection.maps.entities.Cat;

public class CatCompartor{

	public static final Comparator<Cat> BY_NAME = (cat1, cat2)->
		cat1.getName().compareTo(cat2.getName());
		
		public static final Comparator<Cat> BY_PRICE = (cat1, cat2)->
		(int) (cat1.getPrice()-cat2.getPrice());
}
