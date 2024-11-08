package com.assignment_S;

public class CBA {

	public static void main(String[] args) {
	
		        int n = 4;
		        
		        for (int row = n; row >= 1; row--) {
		            for (char ch = (char) ('A' + row - 1); ch <= 'A' + n - 1; ch++) {
		                System.out.print(ch + " "); 
		            }
		            System.out.println();
		        }
		    }
		


	}


