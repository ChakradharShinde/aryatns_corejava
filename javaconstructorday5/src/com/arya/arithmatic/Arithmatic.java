package com.arya.arithmatic;

import com.arya.arithmatic.utilities.ArithmaticUtility;

public class Arithmatic {

	public static void main(String[] args) {
		ArithmaticUtility operation = new ArithmaticUtility(10,20);
		int choice;
		do {
			choice = operation.printMenu();
			switch(choice) {
			//  case 1:operation.addition;
			//         break;
				case 1->operation.addition();
				case 3->operation.multiplication();
				case 0->System.out.println("Exit.. ");
				default->System.out.println("Invalid Input");
			}	
		}while(choice!=0);
	}
}
