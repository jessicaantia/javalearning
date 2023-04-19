package com.samples.sessionone;

import com.samples.sessiontwo.Util;
import java.util.Date;

/**
 * @author Jessica
 *
 */
public class Basics {
	
	/**
	 * Multiple line comment.
	 */
	String name;
    int numEggs = 12; // initialize on line
    long max = 3123456789L; // now Java knows it is a long
    
    // Legal declarations
    boolean b1, b2;
    String s1 = "1", s2;
    int i1; int i2;

	/* Multiple
	* line comment */
	public Basics() {
        name = "Duke"; // initialize in constructor
        Date date = new Date();
        
        if(true) {
        	int i = 0;
        }
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// comment until end of line
        System.out.println("Hello World!");
        
        //Util util = new Util();
        System.out.println(Util.getLastName());
        
        System.out.println("isValidNumber"+ Util.isValidNumber("A"));
        
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

}
