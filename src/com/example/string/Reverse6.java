package com.example.string;

import java.util.Collections;

public class Reverse6 {

	public static void main(String[] args) {

		String str = "Prabhu";
		System.out.println(reverseString(str.toCharArray(), 0, str.length() - 1));
	}

	static String reverseString(char[] chars, int start, int end) {

		while (start < end) {
			chars[start] ^= chars[end];
			chars[end] ^= chars[start];
			chars[start] ^= chars[end];
			start++;
			end--;
		}

		return String.valueOf(chars);
	}
}
