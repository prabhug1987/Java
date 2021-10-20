package com.example.string.conversion;

public class DoubleToString {

	public static void main(String[] args) {
		// parsing a double value from a string
		double d = Double.parseDouble("23.6");
		
		System.out.println(d);
		String double1 = "23.4d";
		System.out.println(Double.toString(d));
		
	}
}
