package com.methods;

public class one {

	public static void main(String[] args) {
		
		System.out.println("this is the main method executed by internal translator");
		suzuki();
		honda();
		ford();
	}
	
	public static void suzuki() {
		System.out.println("access");
	}
	public static void honda() {
		System.out.println("Shine");
	}
	public static void ford() {
		System.out.println("fiesta");
	}
}
