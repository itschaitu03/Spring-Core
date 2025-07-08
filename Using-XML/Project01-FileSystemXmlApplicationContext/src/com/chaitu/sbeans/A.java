package com.chaitu.sbeans;

import java.time.LocalDate;

public class A {

	private LocalDate date;

	public A() {
		System.out.println("A :: 0 param Construtor");
	}

	public void setDate(LocalDate date) {
		System.out.println("A.setDate()");
		this.date = date;
	}

	@Override
	public String toString() {
		return "A [date=" + date + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

}
