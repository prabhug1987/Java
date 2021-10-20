package com.example.string.conversion;

public class StringToLong {

	public static void main(String[] args) {
		// string to long value
		long l = Long.parseLong("2000");
		System.out.println(l);
		String str = "200000000000000000";
		long l1 = Long.parseLong(str);
		System.out.println(l1);

	}
}
