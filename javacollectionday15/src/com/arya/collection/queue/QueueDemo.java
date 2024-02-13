package com.arya.collection.queue;

import java.util.PriorityQueue;
import java.util.Queue;

import com.arya.collection.entities.Dog;

public class QueueDemo {

	public static void main(String[] args) {
		Queue<Integer> integerQueue = new PriorityQueue<>();
		
		//enqueueing
		integerQueue.offer(4);
		integerQueue.add(2);
		integerQueue.add(3);
		System.out.println(integerQueue);
		//poll() to remove an element
		//Dequeuing
		integerQueue.remove();
		System.out.println(integerQueue);
		integerQueue.poll();
		System.out.println(integerQueue);
		integerQueue.poll();
		System.out.println(integerQueue);
		
		Queue<Dog> dogQueue = new PriorityQueue<>(
					(dog1,dog2)->dog1.getName().compareTo(dog2.getName()));
	
		dogQueue.add(new Dog("German Shepherd", "Herding", 1000));
		dogQueue.add(new Dog("Hunter", "Hunting", 2000));
		dogQueue.add(new Dog("Doberman", "Loyal", 500));
		
		System.out.println(dogQueue);
		dogQueue.poll();
		System.out.println(dogQueue);
		dogQueue.poll();
		System.out.println(dogQueue);
		dogQueue.poll();
		System.out.println(dogQueue);
		
	}
}
