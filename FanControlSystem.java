package com.methods;

public class FanControlSystem {

	private static int speed = 0;

	public static void increaseSpeed() {
		if (speed < 3) {
			speed++;
			System.out.println("Fan speed increased to: " + speed);
		} else {
			System.out.println("Fan is already at maximum speed.");
		}
	}

	public static void decreaseSpeed() {
		if (speed > 0) {
			speed--;
			System.out.println("Fan speed decreased to: " + speed);
		} else {
			System.out.println("Fan is already at minimum speed.");
		}
	}

	public static void main(String[] args) {
		increaseSpeed(); // Fan speed increased to: 1
		increaseSpeed(); // Fan speed increased to: 2
		decreaseSpeed(); // Fan speed decreased to: 1
		decreaseSpeed(); // Fan speed decreased to: 0
		}
	}
