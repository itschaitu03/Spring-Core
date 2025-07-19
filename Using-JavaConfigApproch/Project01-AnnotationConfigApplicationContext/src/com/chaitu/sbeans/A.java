package com.chaitu.sbeans;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("a")
public class A {

	@Autowired
	private LocalDate date;

	public A() {
		System.out.println("A :: 0 param Constructor ");
	}

	@Override
	public String toString() {
		return "A [date=" + date + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
}
