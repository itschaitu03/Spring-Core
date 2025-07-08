package com.chaitu.sbeans;

public class A {

	private B b;

	public A() {
		System.out.println("A :: 0 param Construtor");
	}

	public void setB(B b) {
		this.b = b;
		System.out.println(this.b);
		System.out.println("A.setB()");
	}

	@Override
	public String toString() {
		return "A [b=" + b + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

}
