package com.arya.generics;

// T type, K key, V value
public class GenericClass<T> {

	T obj;
	
	public GenericClass(T obj) {
		super();
		this.obj = obj;
	}
	
	

	public T getObj() {
		return obj;
	}



	public void setObj(T obj) {
		this.obj = obj;
	}



	public void printObject(T obj) {
		System.out.println(obj);
	}
}
