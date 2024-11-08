package com.assignment_S;

public class Rhombus {

	public static void main(String[] args) {
		
		int space = 3 , ash = 0;
		for(int row = 1 ; row <= 5 ; row++ ) {
			
			space = (row <= 3) ? space-1: space+1 ;
			ash = (row<= 3) ? ash+2 : ash-2 ;
		
			for(int i = 1 ; i <= space ; i++) {
				System.out.print(" ");
			}
			for (int i = 1 ; i <= ash ; i++) {
				System.out.print("#");
			}
			System.out.println();
}
}
		}
