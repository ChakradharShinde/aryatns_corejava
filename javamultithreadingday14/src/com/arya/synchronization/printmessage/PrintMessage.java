package com.arya.synchronization.printmessage;

public class PrintMessage implements Runnable{
	
	

	public /*synchronized*/ void printMessage() {
		System.out.println("[");
		
		try {
			Thread.sleep(1000);
			System.out.println("Hello");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("]");
	}

	@Override
	public void run() {
		synchronized(this) {
			printMessage();
		}
	}
}
