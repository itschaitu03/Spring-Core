package com.chaitu.sbeans;

public class Mobile {

	private int percentage;

	public Mobile() {
		System.out.println("Mobile :: 0 param Constructor");
	}

	public String mobileBatteryStatus(String userName) {
		percentage = Battery.getPercentage();
		if (percentage <= 20) {
			return "Turn on the battery saver ::" + userName;
		}

		else if (percentage <= 40) {
			return "Low battery ::" + userName;
		}

		else if (percentage <= 80) {
			return "Medium battery ::" + userName;
		}

		else {
			return "High battery ::" + userName;
		}
	}

	@Override
	public String toString() {
		return "Mobile [percentage=" + percentage + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

}
