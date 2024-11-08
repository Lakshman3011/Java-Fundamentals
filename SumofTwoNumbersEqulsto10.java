package com.methods;

public class SumofTwoNumbersEqulsto10 {

	public static void main(String[] args) {
		boolean value = num(1,9);
		System.out.println(value);
	}

	private static boolean num(int i, int j) {
	
		return i+j == 10;

	}

}
