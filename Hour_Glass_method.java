package com.assignment_S;

public class Hour_Glass_method {

	public static void main(String[] args) {

		int space = -1, value = 5, num = 0;

		for (int row = 1; row <= 7; row++) {

			space = (row <= 4) ? space + 1 : space - 1;
			value = (row <= 4) ? value - 1 : value + 1;
			num = (row <= 4) ? num + 1 : num - 1;

			for (int i = 1; i <= space; i++) 
				System.out.print(" ");

				int k = num;
				for (int j = 1; j <= value; j++)
					System.out.print(k++ +" ");
				System.out.println();
			}
		}
	}

