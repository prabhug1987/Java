package com.example.string.conversion;

public class StringToCharExample {
	public static void main(String[] args) {
		String s = "hello";
		// fetch or get a char at 0th index in a string
		char c = s.charAt(0);
		// get the char values from string
		char[] ch=s.toCharArray();    
		System.out.println("1st character is "+c);
		
		//iterate and print the string
		for (int i = 0; i < s.length(); i++) {
			System.out.println("char at "+i+" index is: "+ch[i]);   
		}
		
	}

}
