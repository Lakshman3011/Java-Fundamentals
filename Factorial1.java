package com.methods;

public class Factorial1 {

	public static void main(String[] args) {

		int finalValue = factorial1(6);
		System.out.println(finalValue);

	}

	private static int factorial1(int num) {

		int fact = 1;
		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		return fact;

	}

}
