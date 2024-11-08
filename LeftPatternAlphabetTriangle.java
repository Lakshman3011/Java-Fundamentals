package com.assignment_S;

public class LeftPatternAlphabetTriangle {

	public static void main(String[] args) {
		
		int star = 0;
		char ch = 'A';
		
		for (int row = 1 ; row <= 3 ; row++) {
			
			star++;
			for(int i = 1 ; i <= star ; i++) {
				System.out.print(ch++);
			}
			System.out.println();
		}
	}

}
