package com.assignment_S;

public class XTriangle {

	public static void main(String[] args) {

		int stars = 7, space = -1;
		for (int row = 1; row <= 5; row++) {

			if (row <= 3) {
				space++;
				stars -= 2;
			} else {
				space--;
				stars += 2;
			}
			for (int i = 1; i <= space; i++) {
				System.out.print(" ");
			}
			for (int i = 1; i <= stars; i++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}
