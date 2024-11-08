package com.assignment_S;

public class OneToFour {

	public static void main(String[] args) {

		int spaces = -1;
		int values = 5;
		for (int rows = 1; rows <= 5; rows++) {

			values--;
			spaces++;
			int k = rows;
			for (int i = 1; i <= spaces; i++) {
				System.out.print(" ");
			}
			for (int i = 1; i <= values; i++) {
				System.out.print(k++ + " ");
			}
			System.out.println();

		}
	}
}
