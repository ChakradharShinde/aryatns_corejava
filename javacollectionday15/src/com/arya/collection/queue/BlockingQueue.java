package com.arya.collection.queue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

public class BlockingQueue {
	
	public static void main(String[] args) {
		//Bound
//		ArrayBlockingQueue<Integer> blockingQueue = 
//				new ArrayBlockingQueue<>(3);
		//UnBound
		LinkedBlockingDeque<Integer> blockingQueue = 
				new LinkedBlockingDeque<>();
		
		
		//Supplier Thread
		new Thread(()->{
			try {
				for(int i=0;i<100;i++) {
					System.out.println("Set:" + i);
					blockingQueue.put(i);
					Thread.sleep(100);
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}).start();
		
		// Consumer Thread
		new Thread(()->{
			try {
				int limit=0;
				while(limit<=10) {
					limit = blockingQueue.take();
					System.out.println("Get:" + limit);
					Thread.sleep(1000);
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}).start();
	}
}
