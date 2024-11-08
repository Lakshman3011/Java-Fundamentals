package com.methods;

public class TelevisionControlSystem {

	public static int volume = 10;
	private static int channel = 1;

	public static void changeChannel(int newChannel) {
		if (newChannel > 0 && newChannel <= 100) {
			channel = newChannel;
			System.out.println("Channel changed to: " + channel);
		} else {
			System.out.println("Invalid channel number.");
		}
	}

	public static void increaseVolume() {
		if (volume < 100) {
			volume++;
			System.out.println("Volume increased to: " + volume);
		} else {
			System.out.println("Volume is already at maximum.");
		}
	}

	public static void decreaseVolume() {
		if (volume > 0) {
			volume--;
			System.out.println("Volume decreased to: " + volume);
		} else {
			System.out.println("Volume is already at minimum.");
		}
	}

	public static void main(String[] args) {
		 changeChannel(5); // Channel changed to: 5
		 increaseVolume(); // Volume increased to: 11
		 decreaseVolume(); // Volume decreased to: 10
		 }
}
