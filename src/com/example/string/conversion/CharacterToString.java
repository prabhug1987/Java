package com.example.string.conversion;

public class CharacterToString {
	
	public static void main(String[] args) {
		char c ='S';
		// converting a char to string value using String class
		String s = String.valueOf(c);
		
		System.out.println(s);
		
		c = 'M';
		// converting a char value to string value using Character class
		s = Character.toString(c);
		System.out.println(s);
	}

}
