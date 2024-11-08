package com.methods;

public class EligibleforVoteOrNot {

	public static void main(String[] args) {
		boolean value = num(24);
		System.out.println(value);
	}

	private static boolean num(int vote) {
	
		
		return vote >= 18;

	}

}
