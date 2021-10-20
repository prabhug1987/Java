package com.example.operators;

public class Examples {
	
	public static void main(String[] args) {
		System.out.println(10 << 2); // 10 * 2power2 = 10* 4 = 40
		System.out.println(10 << 3); // 10 * 2power2 = 10* 8 = 80
		System.out.println(20 << 2); // 20 * 2 ^ 2;
		System.out.println(15 << 4);// 15 * 2 ^ 4 = 15 * 16
		
		System.out.println(10 >> 2); // 10 / 2 power 2 = 10/ 4 = 40
		System.out.println(10 >> 3); // 10 / 3 power 2 = 10/ 8 = 80
		System.out.println(20 >> 2); // 20 / 2 ^ 2;
		System.out.println(15 >> 4);// 15 / 2 ^ 4 = 15 / 16
		
		//For positive number, >> and >>> works same  
	    System.out.println(20 >> 2);  //20 / 2 * 2
	    System.out.println(20 >>> 2); //20 / 2 * 2 
	    //For negative number, >>> changes parity bit (MSB) to 0 parity last bit  
	    System.out.println(-20 >> 2);  
	    System.out.println(-20 >>> 2);  
		
	}

}
