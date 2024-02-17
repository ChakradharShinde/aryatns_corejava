package com.arya.generics.genericinterface;

public class MainPrint {

	public static void main(String[] args) {
		Print<Integer> integerReverse = number->{
			int result=0;
			while(number!=0) {
				result = 10 * result + number %10;
				number=number/10;
			}
			System.out.println(result);
		};
		
		integerReverse.print(234);
		
		Print<String> stringReverse = str->{
			char[] charArray = str.toCharArray();
			int left=0;
			int right=charArray.length-1;
			
			while(left<right) {
				char ch = charArray[left];
				charArray[left]=charArray[right];
				charArray[right]=ch;
				left++;
				right--;
			}
			System.out.println(charArray);
		};
		
		stringReverse.print("Hello there..");
		
		
	}
	
	
	
	
}
