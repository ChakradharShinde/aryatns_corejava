package com.arya.exception;

public class UncheckedToChecked {

	public static void main(String[] args) {
		int []arr = {1,2,3,4};
		
		try {
			//printArray(arr);
			System.out.println(arr[4]);
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			System.out.println(e.toString());
			e.printStackTrace();
		}
	}
	
	static void printArray(int... arr) throws Exception {
		try {
			System.out.println(arr[4]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getLocalizedMessage());
			throw new Exception("ArrayIndexOutOfBound");
		}	
	}
}
