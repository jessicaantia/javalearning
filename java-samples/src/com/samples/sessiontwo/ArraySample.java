package com.samples.sessiontwo;

import java.util.Arrays;
import java.util.ArrayList; // import just ArrayList

public class ArraySample {

	public static void main(String[] args) {
		int[] numbers1 = new int[3];
		int[] numbers2 = new int[] { 42, 55, 99 };

		String[] bugs = { "cricket", "beetle", "ladybug" };
		String[] alias = bugs;
		System.out.println(bugs.equals(alias)); // true
		System.out.println(bugs.toString()); // [Ljava.lang.String;@160bc7c0

		int[] numbers = new int[10];
		numbers[10] = 3;
		numbers[numbers.length] = 5;
		for (int i = 0; i <= numbers.length; i++)
			numbers[i] = i + 5;

		String[] strings = { "10", "9", "100" };
		Arrays.sort(strings);
		for (String string : strings)
			System.out.print(string + " ");

		System.out.println(Arrays.compare(new int[] { 1 }, new int[] { 2 }));

		String[][] rectangle = new String[3][2];

		ArrayList list1 = new ArrayList();
		ArrayList list2 = new ArrayList(10);
		ArrayList list3 = new ArrayList(list2);

		ArrayList list = new ArrayList();
		list.add("hawk"); // [hawk]
		list.add(Boolean.TRUE); // [hawk, true]
		System.out.println(list); // [hawk, true]

		// Wrapper classes
		int primitive = Integer.parseInt("123");
		Integer wrapper = Integer.valueOf("123");
		Boolean.valueOf("TRUE");
		Double.valueOf("2.2");

	}

}
