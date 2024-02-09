package com.arya.deadlockdemo;

public class DeadLock {

	public static void main(String[] args) {
		Object lock1 = new Object();
		Object lock2 = new Object();
		
		Runnable thread1 = ()->{
			synchronized (lock1) {
				System.out.println("Thread-1 using Resource Lock-1 ");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			
				synchronized (lock2) {
					System.out.println("Thread-1 using Resource Lock-2");
				}
			}
		};
		
		Runnable thread2 = ()->{
			synchronized (lock2) {
				System.out.println("Thread-2 using Resource Lock-2");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				synchronized (lock1) {
					System.out.println("Thread-2 using Resource Lock-1");
				}
			}
		};
		
		Thread thread01 = new Thread(thread1);
		Thread thread02 = new Thread(thread2);
		
		thread01.start();
		thread02.start();

	}	
}
