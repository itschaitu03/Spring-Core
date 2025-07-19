package com.chaitu.sbeans;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("whf")
public class WeeksHolidaysFinder {

	private LocalDate date;

	public WeeksHolidaysFinder() {
		System.out.println("WeeksHolidaysFinder :: 0 param Construtor");
	}

	@Autowired
	public void setDate(LocalDate date) {
		this.date = date;
		System.out.println("WeeksHolidaysFinder.setDate()");
	}

	public String showHolidays(String userName) {
		int day = date.getDayOfWeek().getValue();
		if (day == 6 || day == 7) {
			return "Yes, Today is a Holiday ::" + userName;
		}

		else {
			return "No, Today is a Working Day ::" + userName;
		}
	}

	@Override
	public String toString() {
		return "WeeksHolidaysFinder [date=" + date + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

}
