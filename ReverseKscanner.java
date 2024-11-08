package com.assignment_S;

import java.util.Scanner;

public class ReverseKscanner {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the n Value: ");
		int n = sc.nextInt();

		int lines = 2 * n - 1;
		int star = n + 1, space = n - star;

		for (int row = 1; row <= lines; row++) {

			space = (row <= n) ? space + 1 : space - 1;
			star = (row <= n) ? star - 1 : star + 1;

			for (int i = 1; i <= space; i++)
				System.out.print(" ");
			for (int i = 1; i <= star; i++)
				System.out.print("*");
			System.out.println();
		}

	}
}
