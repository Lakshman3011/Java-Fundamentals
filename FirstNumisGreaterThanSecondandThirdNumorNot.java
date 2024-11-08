package com.methods;

public class FirstNumisGreaterThanSecondandThirdNumorNot {

	public static void main(String[] args) {
		boolean value = num(24,34,44);
		System.out.println(value);
	}

	private static boolean num(int a , int b , int c) {
	
		
		return a > b && a > c;

	}

}
