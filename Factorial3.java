package com.methods;

public class Factorial3 {

	public static void main(String[] args) {
		
		int finalValue = factorial3(14);
		System.out.println(finalValue);

	}

	private static int factorial3(int num) {
		
		int fact = 1 ;
		for(int i = 1 ;  i <= num ; i++) {
			fact = fact * i ;
		}
		return fact;
		
		
	}
	
}


	