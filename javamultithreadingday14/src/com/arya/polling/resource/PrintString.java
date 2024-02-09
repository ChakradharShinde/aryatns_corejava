package com.arya.polling.resource;

public class PrintString {
	
	private String msg;
	
	private boolean isReady;

	public synchronized String getString() {
		while(!isReady)
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		
		isReady=false;
		notify();
		return msg;
	}
	
	public synchronized void setString(String msg) {
		while(isReady)
			try {
				// wait() valid in synchronized context only..
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		this.msg=msg;	
		System.out.println("Set:" + msg);
		notify();
		isReady = true;
	}
}
