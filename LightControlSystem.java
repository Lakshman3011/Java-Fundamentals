package com.methods;

public class LightControlSystem {

	public static boolean isOn = false;

	public static void toggleLight() {
		isOn = !isOn;
		if (isOn) {
			System.out.println("Light is ON.");
		} else {
			System.out.println("Light is OFF.");
		}
	}

	public static void main(String[] args) {
		toggleLight(); // Light is on
		toggleLight(); // Light is off
	}
}