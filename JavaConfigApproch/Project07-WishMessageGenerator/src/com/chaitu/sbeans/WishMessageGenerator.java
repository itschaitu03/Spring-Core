package com.chaitu.sbeans;

import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMessageGenerator {

	@Autowired
	private LocalTime time;

	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator :: 0 param Construtor");
	}

	public String showMessage(String userName) {
		int hour = time.getHour();
		if (hour >= 6 || hour <= 12) {
			return "Good Morning :: " + userName;
		}

		else if (hour <= 18) {
			return "Good Afternoon :: " + userName;
		}

		else if (hour <= 21) {
			return "Good Evening :: " + userName;
		}

		else {
			return "Good Night :: " + userName;
		}
	}

	@Override
	public String toString() {
		return "WishMessageGenerator [time=" + time + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

}
