package com.arya.collection.comparators;

import java.util.Comparator;

import com.arya.collection.entities.Dog;

public class DogPriceComparator implements Comparator<Dog>{

	@Override
	public int compare(Dog dog1, Dog dog2) {
//		return Float.compare(dog1.getPrice(), dog2.getPrice());
		return (int) (dog1.getPrice()-dog2.getPrice());
	}

}
