package com.example.string.conversion;

public class Decimal2HexExampl2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hexadecimal of 10 is: " + toHex(10));
		System.out.println("Hexadecimal of 15 is: " + toHex(15));
		System.out.println("Hexadecimal of 289 is: " + toHex(289));
	}

	private static String toHex(int decimal) {
		// TODO Auto-generated method stub

		int rem;
		String hex = "";
		char hexChars[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
		
		while(decimal > 0) {
			
			rem = decimal % 16;// get the remainder by dividing the number by 16
			hex = hexChars[rem] + hex; // get the value for a particular index and add with existing hex string
			decimal = decimal / 16; // to remove the last degit like sum of degit
		}

		return hex;
	}

}
