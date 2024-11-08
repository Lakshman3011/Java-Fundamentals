package com.methods;

public class GivenQuantityisdozensOrNot {

	public static void main(String[] args) {
		boolean value = num(24);
		System.out.println(value);
	}

	private static boolean num(int fruits) {
	
		
		return fruits%12 == 0;



	}

}
