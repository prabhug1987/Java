package com.example.string.conversion;

public class Hex2Decimal {

	public static void main(String[] args) {
		System.out.println("Decimal of a is: "+hex2Decimal("a"));  
		System.out.println("Decimal of f is: "+hex2Decimal("f"));  
		System.out.println("Decimal of 121 is: "+hex2Decimal("121"));  
	}

	public static int hex2Decimal(String hex) {
		// define a hexa digits in a string
		String digits = "0123456789ABCDEF";
		// convert the letter to uppercase
		hex = hex.toUpperCase();

		int val = 0;
		//iterate
		for (int i = 0; i < hex.length(); i++) {
			//get char at the index
			char c = hex.charAt(i);
			//get index position of a char
			int d = digits.indexOf(c);
			// multply with existing value and add d value to it
			val = 16 * val + d;
		}
		
		return val;
	}
}
