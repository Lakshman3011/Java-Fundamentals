package com.assignment_S;

public class Pyramidpattern {

	public static void main(String[] args) {
		int space = 3;
		int ash = -1;
		for (int row = 1; row <= 3; row++) {

			ash+=2;
			space--;
			for (int i = 1; i <= space; i++) {
				System.out.print(" ");
			}
			for (int i = 1; i <= ash; i++) {
				System.out.print("#");
	}
			System.out.println();
}
}
}