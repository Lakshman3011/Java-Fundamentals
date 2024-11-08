package com.assignment_S;

public class pyramid {

	public static void main(String[] args) {

		int spaces =3; 
		int star = 1;
		int i = 1;
		for (int row = 1; row <= 4; row++) {
			if (i <= 3) {
				star++;
				spaces--;
			} else {
				star--;
				spaces++;
			}
			for (int k = 1; k <= row; k++) {
				System.out.print("*");

			}
			System.out.println();

		}
	}
}
