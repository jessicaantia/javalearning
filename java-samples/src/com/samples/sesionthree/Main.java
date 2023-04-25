package com.samples.sesionthree;

public class Main {
	
	public static void main(String[] args) {
		Gorilla gorilla = new Gorilla(10);
		
		gorilla.name = "Dog";
		
		System.out.println(gorilla.getAge());
		
		Gorilla gorillaTwo = new Gorilla(12);
		;
		System.out.println(gorillaTwo.getAge());
	}

}
