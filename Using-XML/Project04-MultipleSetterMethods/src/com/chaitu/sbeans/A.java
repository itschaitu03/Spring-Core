package com.chaitu.sbeans;

import java.time.LocalDate;
import java.time.LocalTime;

public class A {

	private LocalDate date;
	private LocalTime time;
	private String name;

	public A() {
		System.out.println("A :: 0 param Construtor");
	}

	public void setDate(LocalDate date) {
		System.out.println("A.setDate()");
		this.date = date;
	}

	public void setTime(LocalTime time) {
		this.time = time;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "A [date=" + date + ", time=" + time + ", name=" + name + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}

}
