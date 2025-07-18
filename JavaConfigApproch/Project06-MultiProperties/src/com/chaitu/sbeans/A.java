package com.chaitu.sbeans;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("a")
public class A {

	@Autowired
	private LocalDate date;

	@Autowired
	private LocalTime time;

	@Value("Chaitu")
	private String name;

	@Value("22")
	private int age;

	public A() {
		System.out.println("A :: 0 param Constructor ");
	}

	@Override
	public String toString() {
		return "A [date=" + date + ", time=" + time + ", name=" + name + ", age=" + age + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}

}
