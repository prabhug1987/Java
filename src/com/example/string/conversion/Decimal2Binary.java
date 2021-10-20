package com.example.string.conversion;

public class Decimal2Binary {

	public static void main(String[] args) {
		System.out.println("decimal of 10 is ");
		 toBinary(10);
		System.out.println("decimal of 21 is ");
		 toBinary(21);
		System.out.println("decimal of 31 is ");
		 toBinary(31);
	}

	public static void toBinary(int decimal) {
		int[] binary = new int[40];
		int index = 0;
		while (decimal > 0) {
			binary[index++] = decimal % 2; // get the remainder value by using modulus of 2
			decimal = decimal / 2;// to remove the last digit
		}
		// print the values in the array
		for (int i = index - 1; i >= 0; i--) {
			System.out.print(binary[i]);
			
		}
		System.out.println();
	}

}
