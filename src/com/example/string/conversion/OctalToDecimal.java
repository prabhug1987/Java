package com.example.string.conversion;

public class OctalToDecimal {
	
	public static void main(String[] args) {
	
		//Printing the result of conversion  
		System.out.println("Decimal of 121 octal is: "+getDecimal(121));    
		System.out.println("Decimal of 23 octal is: "+getDecimal(23));    
		System.out.println("Decimal of 10 octal is: "+getDecimal(10));    
	}

	private static int getDecimal(int octal) {
		// TODO Auto-generated method stub
		// declare a variable to store a decimal value
		int decimal = 0;
		
		//declare a variable to use in power
		int n = 0;
		
		// iterating till the value is 0
		while(true) {
			if(octal == 0) {
				break;
			}else {
				int temp = octal % 10; // mod value by 10 to get the remainder
				decimal +=temp * Math.pow(8,n); // multiply the value with 8 to the power of index
				octal = octal / 10; // remove the last digit
				n++; //increment n value
			}
		}
		return decimal;
	}
	
	

}
