package com.example.string.conversion;

public class Binary2Decimal {
	
	public static void main(String[] args) {
		
		//define a binary string 
		String binaryString = "1011";
		// convert it to decimal using integer methods 
		int decimal = Integer.parseInt(binaryString,2);
		System.out.println(decimal);
		
		System.out.println(Integer.parseInt("1010",2));
		System.out.println(Integer.parseInt("10101",2));
		System.out.println(Integer.parseInt("11111",2));
	}

}
