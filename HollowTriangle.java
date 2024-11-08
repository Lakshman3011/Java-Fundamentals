package com.assignment_S;

public class HollowTriangle {

	public static void main(String[] args) {
		int lines = 4;
		int space = lines , ash = -1 ;
		for (int row = 1 ; row <= lines ; row++) {
			space--;
			ash+=2;
			for(int i = 1 ; i <= space ; i++ ) {
				System.out.print(" ");
			}
			for (int i = 1 ; i <= ash ; i++) {
				if (row > 1 && row < lines) {
					if( i == 1 || i == ash)
						System.out.print("#");
					else
						System.out.print(" ");
				} else {
					System.out.print("#");
				}
			}
			System.out.println();
	}
}
}