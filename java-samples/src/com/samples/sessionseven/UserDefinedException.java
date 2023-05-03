package com.samples.sessionseven;

// class represents user-defined exception  
public class UserDefinedException extends Exception {

	private final String code;

	private final String error;

	public UserDefinedException(String code, String error) {
		// Calling constructor of parent Exception
		super(error);
		this.code = code;
		this.error = error;
	}

	@Override
	public String toString() {
		return "UserDefinedException [code=" + code + ", error=" + error + "]";
	}

}
