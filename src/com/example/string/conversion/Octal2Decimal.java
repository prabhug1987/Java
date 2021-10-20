package com.example.string.conversion;

public class Octal2Decimal {
	
	public static void main(String[] args) {
		//Declaring an octal number  
		String octalString="121";  
		//Converting octal number into decimal  
		int decimal=Integer.parseInt(octalString,8);  
		//Printing converted decimal number  
		System.out.println("the decimal value is "+decimal);
		
		
		
		System.out.println("get the higher order 1 bit of 1010 "+ Integer.highestOneBit(10));
		System.out.println(" get the lower order 1 bit of 1010 "+Integer.lowestOneBit(10));
		
		System.out.println(" dividing unsigned interger "+Integer.divideUnsigned(10, 2));
		System.out.println(" dividing unsigned interger with -ve "+Integer.divideUnsigned(-10, 2)); // return max integer value
		
		System.out.println(" compare 10 with 2 "+Integer.compare(10, 2));
		System.out.println(" compare 10 with 2 unsigned "+Integer.compareUnsigned(10, 2));
		System.out.println(" compare 10 with 2 unsigned with negative value "+Integer.compareUnsigned(-10, 2)); // return 1
		System.out.println(" bit count for value 10 is " + Integer.bitCount(10));
		
		System.out.println("number of leading zeros "+ Integer.numberOfLeadingZeros(000111));// return 25 why?
		System.out.println("number of trailing zeors "+ Integer.numberOfTrailingZeros(100));// return 2
		
	}

}
