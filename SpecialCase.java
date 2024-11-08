package com.assignment_S;

public class SpecialCase {

	public static void main(String[] args) {
		int space = 4;
		int value = -1;
		for (int row = 1; row <= 4; row++) {

			space--;
			value += 2;
			int k = row;
			for (int i = 1; i <= space; i++)
				System.out.print(" ");

			for (int i = 1; i <= value; i++) {
				if (i <= (value / 2))
					System.out.print(k--);
				else
					System.out.print(k++);
			}
			System.out.println();
		}

	}
}
