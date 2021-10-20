package com.example.string.conversion;

public class DoubleToInt {

	public static void main(String[] args) {
		// declare a double value
		double d = 10.5;
		// assign to a int value
		int i = (int) d;
		System.out.println(i);
		
		Double d1 = Double.valueOf(10.5); 
		int j = d1.intValue();
		System.out.println("int value is "+ j);	
		
	}
}
