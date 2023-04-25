package com.samples.sesionthree;

public class Animal {
	private int age;
	protected String name;

	public Animal(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	public Animal(int age) {
		super();
		this.age = age;
		this.name = null;
	}

	public int getAge() {
		return this.age;
	}
}
