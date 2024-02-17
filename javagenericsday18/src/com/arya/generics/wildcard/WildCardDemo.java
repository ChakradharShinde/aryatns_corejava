package com.arya.generics.wildcard;

import java.util.ArrayList;
import java.util.List;

public class WildCardDemo {

	public static void main(String[] args) {
		List<Integer> integerList = new ArrayList<>();
		integerList.add(10);
		integerList.add(20);
		integerList.add(30);
		printList(integerList);
	}
	
	//lowerbound
	public static void printList(List<? super Integer> listObj) {
		System.out.println(listObj);
	}
}
