package com.example.string.conversion;

public class String2Boolean {
public static void main(String[] args) {
	String s1 = "true";
	String s2 = "TRue";
	String s3 = "ok";
	// parsing a string value to a boolean
	boolean b1 = Boolean.parseBoolean(s1);
	boolean b2 = Boolean.parseBoolean(s2);
	boolean b3 = Boolean.parseBoolean(s3);
	
	System.out.println(b1);
	System.out.println(b2);
	System.out.println(b3);
	
	b1 = Boolean.valueOf(s1);
	b2 = Boolean.valueOf(s2);
	b3 = Boolean.valueOf(s3);
	System.out.println(b1);
	System.out.println(b2);
	System.out.println(b3);
	
	
}
}
