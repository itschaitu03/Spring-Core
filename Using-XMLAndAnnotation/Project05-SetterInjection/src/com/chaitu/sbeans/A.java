package com.chaitu.sbeans;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("a")
public class A {

	private LocalDate date;

	public A() {
		System.out.println("A :: 0 param Constructor");
	}

	@Autowired
	public void setDate(LocalDate date) {
		this.date = date;
		System.out.println("A.setDate()");
	}

	@Override
	public String toString() {
		return "A [date=" + date + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

}
