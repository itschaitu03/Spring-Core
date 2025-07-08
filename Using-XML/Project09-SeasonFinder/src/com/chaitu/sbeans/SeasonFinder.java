package com.chaitu.sbeans;

import java.time.LocalDate;

public class SeasonFinder {

	private LocalDate date;

	public SeasonFinder() {
		System.out.println("SeasonFinder :: 0 param Construtor");
	}

	public void setDate(LocalDate date) {
		System.out.println("SeasonFinder.setDate()");
		this.date = date;
	}

	public String showSeason(String userName) {
		int month = date.getMonthValue();
		if (month <= 3) {
			return "Spring Season ::" + userName;
		}

		else if (month <= 6) {
			return "Summer Season ::" + userName;
		}

		else if (month <= 9) {
			return "Rainy Or Autumn Season ::" + userName;
		}

		else {
			return "Winter Season ::" + userName;
		}
	}

	@Override
	public String toString() {
		return "SeasonFinder [date=" + date + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

}
