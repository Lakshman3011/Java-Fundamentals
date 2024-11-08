package com.methods;

public class Example1 {

	public static void main(String[] args) {
		
		wakeup();
	}

	public static  void wakeup() {
		
		System.out.println("Wake up at @ 5:00 AM refresh YourSelf");
		activate();
	}
	
	public static void activate() {
		
		System.out.println("Meditate for 10 mins");
		System.out.println("Do Yoga poses");
		energize();
	}
	
	public static void energize() {
		
		System.out.println("Have Some Food and Get Ready For Class");
	}
	
	
}
