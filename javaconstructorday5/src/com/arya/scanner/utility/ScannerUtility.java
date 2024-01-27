package com.arya.scanner.utility;

import java.util.*;

public class ScannerUtility {

	public void acceptNumbers() {
	
//		Scanner scanner = new Scanner(System.in);
		try(Scanner scanner = new Scanner(System.in)){
			System.out.println("Enter an Integer Number:");
			System.out.println("Number = " + scanner.nextInt());

			System.out.println("Enter an Floating number");
			System.out.println(scanner.nextFloat());
		}
	}
	
	public void acceptCharacters() {
		try(Scanner scanner=new Scanner(System.in)){
			System.out.println("Enter a Character:");
			System.out.println(scanner.next().charAt(0));
			
			System.out.println("Enter a Name: ");
			System.out.println(scanner.next());
			
			System.out.println("Enter An Addres: ");
			scanner.nextLine();
			System.out.println(scanner.nextLine());
		}
	}
	
	
}
