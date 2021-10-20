package com.example.string.conversion;

public class BinaryToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Decimal of 1010 is "+ getDecimal(1010));
		System.out.println("Decimal of 10101 is "+ getDecimal(10101));
		System.out.println("Decimal of 11111 is "+ getDecimal(11111));
	}
	
	public static int getDecimal(int binary) {
		int decimal = 0;
		int n = 0;
		while(true) {
			if(binary == 0) {
				break;
			}else {
				int temp = binary % 10; // to get the remainder
				decimal += temp * Math.pow(2,n); // multiply remainder with the 2 to the power of index
				binary = binary / 10; // to remove the last degit
				n++;
			}
		}
		
		return decimal;
	}

}
