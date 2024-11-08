package com.assignment_S;

public class OneZeroPattern {

	public static void main(String[] args) {
		int star = 0 ;
		for(int row = 0 ; row <= 3 ; row++ ) {
			star++;
		for(int i = 1; i <=star ; i++) {
			int value = (row+i)%2;
			System.out.print(value);
		}
		System.out.println();
		}

	}

}
