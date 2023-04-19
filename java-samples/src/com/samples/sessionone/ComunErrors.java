package com.samples.sessionone;

import java.util.*;
import java.sql.*;

public class ComunErrors {

    short reptile = 65535; // DOES NOT COMPILE 
    char fish = (short)-1; // DOES NOT COMPILE
    long max = 3123456789; // DOES NOT COMPILE
    int num, String value; // DOES NOT COMPILE


	public ComunErrors() {
		// Default constructor
	}

    public static void main(String[] args) {
        Random r = new Random(); // DOES NOT COMPILE
        System.out.println(r.nextInt(10));

        // Conflicts
        Date date;
        
        int hourOfDay = 1;
        if(hourOfDay) { // DOES NOT COMPILE
        	//
        }
        
        int month = 5;
        switch month { // DOES NOT COMPILE case 1: System.out.print("January");
        }
        
        switch (month) // DOES NOT COMPILE case 1: System.out.print("January");
        switch (month) {
        case 1: 2: System.out.print("January"); // DOES NOT COMPILE
        }
        switch (month) {
        case 1 || 2: System.out.print("January"); // DOES NOT COMPILE
        }
    }

    public int notValid() { 
        int y = 10;
        int x;
        int reply = x + y; // DOES NOT COMPILE return reply;
        return reply;
    }

}

public class SecondClass {
	
	public SecondClass() {
		// Default constructor
	}
}
