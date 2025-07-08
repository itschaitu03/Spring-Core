package com.chaitu.sbeans;

import java.util.concurrent.ThreadLocalRandom;

public class Battery {

	private static int percentage;

	public Battery() {
		super();
		percentage = ThreadLocalRandom.current().nextInt(100);
		System.out.println("Battery :: 0 param Construtor");
	}

	public static int getPercentage() {
		System.out.println("Battery.getPercentage()");
		return percentage;
	}

}
