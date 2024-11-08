package com.methods;

public class NumDivBy3and5orNot {

	public static void main(String[] args) {
		boolean value = num(15);
		System.out.println(value);
	}

	private static boolean num(int num) {
	
		
		return num % 3 == 0 && num % 5 == 0;

	}

}
