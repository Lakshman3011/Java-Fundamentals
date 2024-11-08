package com.assignment_S;

public class PolynomialTriangle {

	public static void main(String[] args) {

		int space = 7;
		int value = 0;

		for (int row = 1; row <= 7; row++) {

			space--;
			value++;

			for (int i = 1; i <= space; i++) {
				System.out.print(" ");
			}
			int num = 1;
			for (int i = 1; i <= value; i++) {
				System.out.print(num + " ");
				num = num * (row - i) / i;
			}

			System.out.println();
		}

	}
}