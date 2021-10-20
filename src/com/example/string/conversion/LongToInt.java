package com.example.string.conversion;

public class LongToInt {
	
	public static void main(String[] args) {
		//declare a wrapper type in long
		long l = 500;
		//type casing long to int value
		int i = (int) l;
		System.out.println(i);
		
		// delcare a long wrapper value
		Long l1 = Long.valueOf(500);
		i = l1.intValue();
		System.out.println(i);
	}

}
