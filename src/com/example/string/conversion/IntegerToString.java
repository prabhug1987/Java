package com.example.string.conversion;

public class IntegerToString {

	public static void main(String[] args) {
		// to convert integer value to string value
		String one = String.valueOf(1);
		System.out.println(one);
		
		//convert from integer to string value
		String s = Integer.toString(10);
		
		System.out.println(s);
		
		// formatting a given argument to a string value
		String str = String.format("%d %d ", 10,12);
		System.out.println(str);
	}
}
