package com.methods;

public class NumDivByThreeorNot {

	public static void main(String[] args) {
		boolean value = num(9);
		System.out.println(value);
	}

	private static boolean num(int i) {
	
		
		return i%3 == 0;

	}

}
