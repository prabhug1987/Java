package com.example.string.conversion;

public class DecimalToOctal {

	public static void main(String[] args) {

		// calling integer to octal string method
		System.out.println(Integer.toOctalString(123));
		System.out.println(Integer.toOctalString(19));
		System.out.println(Integer.toOctalString(24));

		// Calling custom method to get the octal number of given decimal value
		System.out.println("Decimal to octal of 8 is: " + toOctal(8));
		System.out.println("Decimal to octal of 19 is: " + toOctal(19));
		System.out.println("Decimal to octal of 81 is: " + toOctal(81));
	}

	private static String toOctal(int decimal) {
		// TODO Auto-generated method stub
		int rem;// declaring a variable to store remainder

		String octal = "";// declaring a variable to store

		char octalchars[] = { '0', '1', '2', '3', '4', '5', '6', '7' };

		// interate the value until the value reaches 0
		while (decimal > 0) {
			rem = decimal % 8; // get the remainder by diving 8
			octal = octalchars[rem] + octal; // get the octal value of the remainder from the array
			decimal = decimal / 8; // remove the last char from the value
		}

		return octal;
	}
}
