package com.methods;

public class sum {

	public static void main(String[] args) {
	
	int a = 9  , b = 5;
	int res = add(a,b); {
	System.out.println("The Processed Value: "+res);
	int squareofnum = squareIt(res);
	System.out.println("SquareNum of "+res+": "+squareofnum);}
	}
	private static int squareIt(int res) {
		return res * res;
	}

	private static int add(int a, int b) {
		return a + b;
	}

}
 