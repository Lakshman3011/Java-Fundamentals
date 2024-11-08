package com.methods;

public class FirstEqualsSecondorNot {

	public static void main(String[] args) {
		boolean value = num(13 , 13);
		System.out.println(value);
	}

	private static boolean num(int i, int j) {
	
		return i * i == j;

	}

}
