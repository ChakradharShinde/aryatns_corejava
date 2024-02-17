package com.arya.generics.reversearray;

public class ReverseArray<T> {

	private T[] objArray;
	
	public ReverseArray(T[] objArray) {
		this.objArray = objArray;
	}

	public void reverse() {
		int left=0;
		int right=objArray.length-1;
		while(left<right) {
			T obj = objArray[left];
			objArray[left] = objArray[right];
			objArray[right]=obj;
			left++;
			right--;
		}
		
	}
}
