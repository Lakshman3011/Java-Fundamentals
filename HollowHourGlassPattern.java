package com.assignment_S;

public class HollowHourGlassPattern {

	public static void main(String[] args) {
		
		int n = 7;
		int star = n + 2, space = n - star + 1;

		for (int row = 1; row <= n; row++) {

			space = (row <= 4) ? space + 1 : space - 1;
			star = (row <= 4) ? star - 2 : star + 2;

			for (int i = 1; i <= space; i++) {
				System.out.print(" ");
			}
			for (int i = 1; i <= star; i++) {
				if (row == 1 || row == 7) {
					if (i <= 4)
						System.out.print("* ");
				} else {
					if (i == 1 || i == star)
						System.out.print("*");
					else
						System.out.print(" ");
				}

			}
			System.out.println();
		}

	}

}
