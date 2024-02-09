package com.arya.multithreading.lifecycle;

public class LifeCycle {

	public static void main(String[] args) {
		PrintTable print2 = new PrintTable(2);
		PrintTable print3 = new PrintTable(3);
		PrintTable print4 = new PrintTable(4);
		
		Thread thread1 = new Thread(print2,"Thread1");
		Thread thread2 = new Thread(print3,"Thread2");
		Thread thread3 = new Thread(print4,"Thread3");
		
		System.out.println(thread1.getState());
		
		System.out.println(thread1.isAlive());
		
//		thread1.setPriority(1);
//		thread2.setPriority(5);
//		thread3.setPriority(10);
		
		thread1.setPriority(Thread.MIN_PRIORITY);
		thread2.setPriority(Thread.NORM_PRIORITY);
		thread3.setPriority(Thread.MAX_PRIORITY);
		
//		thread1.setName("Thread1");
//		thread1.setName("Thread2");
//		thread1.setName("Thread3");
		
		thread1.start();
		thread2.start();
		thread3.start();
		System.out.println(thread1.isAlive());
		if(thread1.isAlive())
		try {
			thread1.sleep(0);
			System.out.println(thread1.getState());
			thread1.join(); // Thread1 will join main method execution
			System.out.println(thread1.getState());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(Thread.currentThread().getName());
		
		System.out.println(thread1.isAlive());
		
		System.out.println("Before Join Method");
	}
}
