package com.example.string.conversion;

public class IntToLong {
	
	public static void main(String[] args) {
		int i = 100;
		Long l = new Long(i); // first way using constructor deprecated
		Long l2 = Long.valueOf(i); //second way using methods
	
		System.out.println(l);
		System.out.println(l2);
		
	}

}
