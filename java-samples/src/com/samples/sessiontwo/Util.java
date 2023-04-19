package com.samples.sessiontwo;

public class Util {
	
	static String varTest;
	
	
	private Util () {
		varTest = "dummy";
	}
	
	public String getName(int i) throws Exception {
		String reg = "void";
		
		if(false) {
			return "";			
		} else {
			throw new Exception();
		}
		
	}
	
	public static String getLastName() {
		return "Lopez";
	}
	
	public static boolean isValidNumber(String value) {
		try {
			Integer.parseInt(value);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

}
