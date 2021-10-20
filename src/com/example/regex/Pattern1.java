package com.example.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pattern1 {

	public static void main(String[] args) {
		String line ="  aa bbbbb   ccc     d  ";
		System.out.println(line.replaceAll("[\\s]+", " "));
	}
}