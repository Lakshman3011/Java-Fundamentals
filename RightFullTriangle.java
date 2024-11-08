package com.assignment_S;

public class RightFullTriangle {

	public static void main(String[] args) {
		int space = 3 ;
		int star = 0 ;
		
		for (int row = 1 ; row <= 5 ; row++ ) {
			
			if (row <= 3) {
				space--;
				star++;
			} else {
				space++;
				star--;
			}
			for (int i = 1 ; i <= space ; i++) {
				System.out.print(" ");
			}
			for (int i = 1 ; i <= star ; i++) {
				System.out.print("*");
			}
			System.out.println();
			}
	}
}
		
