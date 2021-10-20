package com.example.string.conversion;
class Emp{
	
}
public class ObjectToString {

	public static void main(String[] args) {
		Emp e = new Emp();
		// convert an user defined object to a string value
		String s = e.toString();
		// change an object to a string value using String class methods
		String s2 = String.valueOf(e);
		System.out.println(s);
		System.out.println(s2);
	}
}
