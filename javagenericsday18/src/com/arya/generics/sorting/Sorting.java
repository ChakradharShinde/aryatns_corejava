package com.arya.generics.sorting;

// UpperBound
public class Sorting<T extends Comparable<T>> {

	private T[] objectArray;

	public Sorting(T[] objectArray) {
		this.objectArray = objectArray;
	}
	
	public void bubbleSort() {
		for(int i=0;i<objectArray.length;i++)
			for(int j=0;j<objectArray.length-i-1;j++)
				if(objectArray[j].compareTo(objectArray[j+1])>0) {
					T obj = objectArray[j];
					objectArray[j] = objectArray[j+1];
					objectArray[j+1] = obj;
				}
	}
	
}
