package com.assignment_S;

public class LeftUpTriangle1 {

	public static void main(String[] args) {

		int space = 4;
		int atRate = 0;
		for (int row = 1; row <= 4; row++) {

			atRate++;
			space--;
			for (int i = 1; i <= space; i++) {
				System.out.print(" ");
			}
			for (int i = 1; i <= atRate; i++) {
				System.out.print("*");
			} System.out.println();
		}

	}

}
