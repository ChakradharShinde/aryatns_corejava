package com.arya.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleCatch {
	public static void main(String[] args) {
		try(Scanner scanner =new Scanner(System.in)) {
			System.out.println("Enter integer value:");
			int intVariable= scanner.nextInt();
			System.out.println(intVariable);
		} catch(InputMismatchException ex) {
			System.out.println(ex.getMessage());
		}catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		} 
	}
}
