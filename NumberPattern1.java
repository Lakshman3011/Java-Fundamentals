package com.assignment_S;

public class NumberPattern1 {

	public static void main(String[] args) {
		int space = 4;
		int value = 0;
		
		for(int row = 1 ; row <= 4 ; row++) {
			space--;
			value++;
		for(int i = 1 ; i <= space ; i++) {
			System.out.print(" ");
		}for (int i = 1 ; i <= value ; i++ ) {
			System.out.print(value+" ");
		}
		System.out.println();
		}

	}

}
