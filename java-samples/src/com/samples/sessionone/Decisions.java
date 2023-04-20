package com.samples.sessionone;

import java.util.ArrayList;

/**
 * @author Jessica
 *
 */
public class Decisions {

	/**
	 * 
	 */
	public Decisions() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	private void getIf() {
		int ticketsTaken = 0;
		int patrons = 0;
		// Single statement
		if (ticketsTaken > 1)
			patrons++;
			System.out.println("algo");
		// Statement inside a block
		if (ticketsTaken > 1) {
			patrons++;
		}
	}

	private void getSwitch() {
		int dayOfWeek = 5;

		switch (dayOfWeek) {
		default:
			System.out.println("Weekday");
			break;
		case 0:
			System.out.println("Sunday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		}
		
		if (dayOfWeek == 0) {
			
		} else if (dayOfWeek == 6) {
			
		} else {
			
		}
	}

	private void getWhile() {
		int counter = 0;
		while (counter < 10) {
			double price = counter * 10;
			System.out.println(price);
			counter++;
		}
	}

	private void getDoWhile() {
		int lizard = 0;
		do {
			lizard++;
		} while (false);
		System.out.println(lizard); // 1
	}

	private void getFor() {
		for (int i = 0; i < 5; i++) {
			System.out.print(i + " ");
		}
		
		ArrayList<String> arrays = new ArrayList<String>();
		
		for(String tmp : arrays) {
			System.out.println(tmp);
		}
	}

	public void printNames(String[] names) {
		for (int counter = 0; counter < names.length; counter++)
			System.out.println(names[counter]);
	}

}
