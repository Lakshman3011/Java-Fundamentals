package com.methods;

public class Factorial {

	public static void main(String[] args) {
		
		int finalValue = factorial(4);
		System.out.println(finalValue);

	}

	private static int factorial(int num) {
		
		int fact = 1 ;
		for(int i = 1 ;  i <= num ; i++) {
			fact = fact * i ;
		}
		return fact;
		
		
	}
	
}

	

