package com.samples.sessiontwo;

public class StringSample {

	public static void main(String[] args) {
		// Declaration
		String name = "Fluffy";
		//String name = new String("Fluffy");

		// Concatenation
		System.out.println(1 + 2); // 3
		System.out.println("a" + "b"); // ab
		System.out.println("a" + "b" + 3); // ab3
		System.out.println(1 + 2 + "c"); // 3c
		System.out.println("c" + 1 + 2); // c12

		int three = 3;
		String four = "4";
		System.out.println(1 + 2 + three + four); // 64

		String s = "1";// s currently holds "1"
		s += "2";// s currently holds "12"
		s += 3;// s currently holds "123"
		System.out.println(s);// 123

		String s1 = "1";
		String s2 = s1.concat("2");
		s2.concat("3");
		System.out.println(s2);

		// Methods
		String string = "animals";
		System.out.println(string.length()); // 7

		String cadena = "animals";
		System.out.println(cadena.charAt(0)); // a
		System.out.println(cadena.charAt(6)); // s
		//System.out.println(cadena.charAt(7)); // throws exception

		System.out.println(string.indexOf('a')); // 0
		System.out.println(string.indexOf("al"));// 4

		String animals = "animals";
		System.out.println(animals.substring(3));// mals
		System.out.println(animals.substring(animals.indexOf('m'))); // mals
		System.out.println(animals.substring(3, 4)); // m
		System.out.println(animals.substring(3, 7)); // mals
		
		System.out.println(string.toUpperCase()); // ANIMALS 
		System.out.println("Abc123".toLowerCase()); // abc123
		
		System.out.println("abc".equals("ABC")); // false 
		System.out.println("ABC".equals("ABC")); // true 
		System.out.println("abc".equalsIgnoreCase("ABC")); // true
		
		int j = 0;
		
		if(j == 1) {
			// haga esto
		}
		String cadenaTwo = "algo";
		Animal animal = new Animal(name, false, false);
		
		cadenaTwo.toString();
		animal.toString();
		
		if(animal.equals(animal)) {
			
		}
		
		StringBuilder alpha = new StringBuilder("algo");
		alpha.append(" mas");
		
		System.out.println(alpha);
		
		StringBuffer mega = new StringBuffer("algo");
		mega.append("");

	}

}
