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

	public A(LocalDate date, LocalTime time, String name) {
		super();
		this.date = date;
		this.time = time;
		this.name = name;
		System.out.println("A :: 3 param Constructor");
	}

	@Override
	public String toString() {
		return "A [date=" + date + ", time=" + time + ", name=" + name + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}

}
