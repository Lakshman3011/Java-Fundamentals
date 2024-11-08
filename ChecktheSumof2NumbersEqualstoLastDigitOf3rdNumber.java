package com.methods;

public class ChecktheSumof2NumbersEqualstoLastDigitOf3rdNumber {

	public static void main(String[] args) {
		boolean value = num(2,5,7);
		System.out.println(value);
	}

	private static boolean num(int i, int j, int k) {
	
		
		return i + j == k%10;



	}

}
