package com.methods;

public class Example3 {

	public static void main(String[] args) {
		
		jobselection("Ravi", true , 'M');
		System.out.println();
		jobselection("Manasa", true , 'F');
		System.out.println();
		jobselection("RishiKumar" , false , 'M');

	}
	
	public static void jobselection(String name , boolean isselected , char gender) {
		
		String addName = gender == 'F' ? "ms. "+name : "mr. "+name;
		if(isselected) {
			System.out.println("Welcome to alladi cloud sols " +addName);
		} else {
			System.out.println("Hello "+addName);
			System.out.println("We Regret to inform you that your results did not match our expections");
		}
	}
}
