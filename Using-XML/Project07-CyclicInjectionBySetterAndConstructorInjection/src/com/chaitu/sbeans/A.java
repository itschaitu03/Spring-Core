package com.chaitu.sbeans;

public class A {

	private B b;

	public A() {
		System.out.println("A :: 0 param Construtor");
	}

	public A(B b) {
		super();
		this.b = b;
		System.out.println("A :: 0 param Constructor");
	}

	@Override
	public String toString() {
		return "A [b=" + b + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

}
