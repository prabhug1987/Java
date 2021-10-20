package com.example.string.conversion;

public class LongToString {
	
	public static void main(String[] args) {
		//declare or define a long value
		long i = 991312312213l;
		//convert long to string value
		String s = String.valueOf(i);
		System.out.println(s);
		
		String l2 = Long.toString(i);
		
		System.out.println(s);
		
	}

}
