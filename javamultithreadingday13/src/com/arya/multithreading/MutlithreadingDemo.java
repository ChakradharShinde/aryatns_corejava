package com.arya.multithreading;

import com.arya.multithreading.thread.Display;
import com.arya.multithreading.thread.Print;

public class MutlithreadingDemo {

	public static void main(String[] args) {
		Display thread1 = new Display("Thread1");
		Display thread2 = new Display("Thread2");
		Display thread3 = new Display("Thread3");
		Display thread4 = new Display("Thread4");
		//single threaded
//		thread1.run();
//		thread2.run();
//		thread3.run();
//		thread4.run();
		
		
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		
		
		Print print1 = new Print("Thread1");
		Print print2 = new Print("Thread2");
		Print print3 = new Print("Thread3");
		
		Runnable runnable1 = new Runnable() {
			@Override
			public void run(){
				System.out.println("Annonymous Class");
			}
			
		};
		
		Runnable runnable2 = () -> System.out.println("Lambda Expression");
		
		Thread thread5 = new Thread(print1);
		Thread thread6 = new Thread(print2);
		Thread thread7 = new Thread(print3);
		
		Thread thread8 = new Thread(runnable1);
		
		thread5.start();
		thread6.start();
		thread7.start();
		
		thread8.start();
		
		new Thread(runnable2).start();
	}
}
