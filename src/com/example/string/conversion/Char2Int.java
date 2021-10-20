package com.example.string.conversion;

public class Char2Int {
	
	public static void main(String[] args) {
		// declare a char reference
		char c = 'a';
		char c2 = '1';
		// assign a char reference to a int variable
		int a = c;
		int b = c2;
		
		System.out.println(a);
		System.out.println(b);
		
		c = '1';
		// using character get numeric method to get the number value
		a = Character.getNumericValue(c);
		System.out.println(a);
		
		a = Integer.parseInt(String.valueOf(c));
		System.out.println(a);
	}

}
