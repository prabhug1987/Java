package com.example.string.conversion;

public class IntToDouble {

	
	public static void main(String[] args) {
		// declare a integer variable with value
		int i = 200;
		// assign it to a double variable auto boxing
		double d = i;
		System.out.println(d);
		
		
		i = 100;
		
		// using double.valueof convert a int value to double value
		Double d2 = Double.valueOf(i);
		System.out.println(d);
		System.out.println(d2);
		
	}
}
