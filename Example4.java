package com.methods;

public class Example4 {

	public static void main(String[] args) {
		
		System.out.println();
		int result = addition(15,15);
		System.out.println("The Addition of 15 and 15: "+result);
		System.out.println();
		int finalResult = squareof(result);
		System.out.println("The square of "+result+" is /"+result+"/ = "+finalResult);

	}

	private static int addition(int a  , int b) {
		
		return a+b;
	}

	private static int squareof(int result) {
		
		return result*result;
	}
	

}
