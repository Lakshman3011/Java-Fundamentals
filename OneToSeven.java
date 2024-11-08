package com.assignment_S;

public class OneToSeven {

	public static void main(String[] args) {
		int values = 0;
		for (int rows = 1 ; rows <= 4 ; rows++) {
			
			values++;
			int k = rows;
			for (int i = 1 ; i <= values; i++)
				System.out.print(k++);
			
			System.out.println();
		}

	}

}
