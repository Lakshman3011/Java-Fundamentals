package com.methods;

public class AirConditionerControlSystem {

	public static int temperature = 24;

	public static void increaseTemperature() {
		if (temperature < 30) {
			temperature++;
			System.out.println("Temperature increased to: " + temperature);
		} else {
			System.out.println("Maximum temperature reached.");
		}
	}

	public static void decreaseTemperature() {
		if (temperature > 16) {
			temperature--;
			System.out.println("Temperature decreased to: " + temperature);
		} else {
			System.out.println("Minimum temperature reached.");
		}
	}

	public static void main(String[] args) {
		 increaseTemperature(); // Temperature increased to: 25
		 decreaseTemperature(); // Temperature decreased to: 24
		}
	}