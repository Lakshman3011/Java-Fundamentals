package com.assignment_S;

public class Butterfly {

	public static void main(String[] args) {

		int stars = 0, spaces = 5;
		for (int row = 1; row <= 5; row++) {

			if (row <= 3) {
				stars++;
				spaces -= 2;
			} else {
				stars--;
				spaces += 2;
			}
			for (int i = 1; i <= stars; i++)
				System.out.print("*");

			for (int i = 1; i <= spaces; i++)
				System.out.print(" ");

			for (int i = 1; i <= stars; i++) {
				if (row == 3 && i == 3)
					System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.println();
		}
	}
}
  