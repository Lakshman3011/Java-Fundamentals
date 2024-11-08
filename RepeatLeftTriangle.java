package com.assignment_S;

public class RepeatLeftTriangle {

	public static void main(String[] args) {
		for (int row = 1; row <= 5; row++) {

			for (int i = 1; i <= 5; i++) {
				char ch = (row == i) ? '#' : ' ';
				System.out.print(ch);
			}
			System.out.println();
		}
		
	}
}
