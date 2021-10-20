package com.example.string.conversion;

public class FloatToString {
	
	public static void main(String[] args) {
		//define a float variable by parsing a float variable
		float f = Float.parseFloat("23.6");
		
		//print a float variable
		System.out.println(f);
		
		//convert a float to a string value
		String s1 = String.valueOf(f);
		System.out.println(s1);
		
		System.out.println(Float.toString(f));
	}

}
