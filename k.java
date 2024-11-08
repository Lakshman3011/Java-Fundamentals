package com.assignment_S;

public class k {

	public static void main(String[] args) {
		
		int star = 5 ;
		
		for(int row = 1; row <= 7 ; row++) {
			
			if(row<=4)
				star--;
			else
				star++;
			
			for(int i =1; i<= star; i++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
