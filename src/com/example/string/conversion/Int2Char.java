package com.example.string.conversion;

public class Int2Char {
	
	public static void main(String[] args) {
		int a = 65;
		// type case int value to char
		char c = (char) a;
		
		System.out.println(a);
		
		a = 1;
		c =(char) (a + '0');
		
		System.out.println(c);
		
		int redix = 10;// `10 for decimal number, 16 for hexa
		a = 1;
		c = Character.forDigit(a, redix);
		
		System.out.println(c);
		
		redix = 16;
		a = 10;
		c = Character.forDigit(a, redix);
		System.out.println(c);
	}

}
