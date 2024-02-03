package com.arya.innerinterface;

import com.arya.innerinterface.Operation.ArithmaticOperation;

public class OperationImpl {

	public static void main(String[] args) {
		ArithmaticOperation operation =
				(number1, number2)-> number1+ number2;
				
				
//				ArithmaticOperation operation1 = new ArithmaticOperation() {
//					
//					@Override
//					public int operation(int number1, int number2) {
//						// TODO Auto-generated method stub
//						return 0;
//					}
//				};
				
			ArithmaticOperation objOperation = new ArithmaticImpl();
			
			int result = objOperation.operation(20, 10);
			System.out.println(result);
	}
}
