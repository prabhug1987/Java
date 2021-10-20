package com.example.string.conversion;

public class Boolean2String {
	public static void main(String[] args) {
		boolean b = true;
		boolean b1 = true;
		String s1 = String.valueOf(b);
		String s2 = String.valueOf(b1);
		
		System.out.println(s1);
		System.out.println(s2);
		
		s1 = Boolean.toString(b);
		s2 = Boolean.toString(b1);
		
		
		System.out.println(s1);
		System.out.println(s2);
		
	}

}
