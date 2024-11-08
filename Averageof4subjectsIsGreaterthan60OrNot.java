package com.methods;

public class Averageof4subjectsIsGreaterthan60OrNot {

	public static void main(String[] args) {
		boolean value = num(15,18,20,19);
		System.out.println(value);
	}

	private static boolean num(int i, int j, int k, int l) {
	
		
		return (i+j+k+l)/4 >= 60;



	}

}
