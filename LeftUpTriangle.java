package com.assignment_S;

public class LeftUpTriangle {

	public static void main(String[] args) {
		int space = 4;
		for (int row = 1; row <= 3; row++) {

			space--;
			for (int i = 1; i <= space; i++) {
				System.out.print("#");
			}
			System.out.println();
		}

	}
}