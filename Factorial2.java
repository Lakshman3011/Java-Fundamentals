package com.methods;

public class Factorial2 {

	public static void main(String[] args) {
		
		int finalValue = factorial2(3);
		System.out.println(finalValue);

	}

	private static int factorial2(int num) {
		
		int fact = 1 ;
		for(int i = 1 ;  i <= num ; i++) {
			fact = fact * i ;
		}
		return fact;
		
		
	}
	
}

	