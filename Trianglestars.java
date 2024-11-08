package com.assignment_S;

public class Trianglestars {

	public static void main(String[] args) {
		
		int space = 5 , stars = 0;
		for(int row = 1 ; row <=5 ; row++) {
			
			space--;
			stars++;
			
			for ( int i =1 ; i <= space ; i++) {
				System.out.print(" ");
			}
			for(int i = 1 ; i <= stars ; i++) {
				System.out.print("* ");
			}System.out.println();
		}
		
	}

}
