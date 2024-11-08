package com.assignment_S;

public class LeftNumberPatternTriangle {

	public static void main(String[] args) {
		int star = 0;
		int value = 0;

		for (int row = 1; row <= 4; row++) {

			star++;
			for (int i = 1; i <= star; i++) {

				System.out.print(value++);
			}
			System.out.println();

		}

	}

}


