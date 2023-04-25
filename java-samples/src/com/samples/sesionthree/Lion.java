package com.samples.sesionthree;

public class Lion extends Animal {
	
	public Lion(int age) {
		super(age);
		// TODO Auto-generated constructor stub
	}

	public void setProperties(int age, String n) {
		// ERROR
		// setAge(age);
		name = n;
	}

	public void roar() {
		System.out.print(name + ", age " + getAge() + ", says: Roar!");
	}

	public static void main(String[] args) {
		var lion = new Lion(12);
		lion.setProperties(3, "kion");
		lion.roar();
	}
}
