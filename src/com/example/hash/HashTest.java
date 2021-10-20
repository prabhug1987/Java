package com.example.hash;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

class HashTest {

	public static void main(String[] args) {
		String str = new String("Hello");
		String str1 = "Hello";

		List<String> list = new ArrayList<>();
		list.add(str);
		list.add(str1);
		list.forEach(System.out::println);
		System.out.println("in hashset");
		HashSet hashSet = new HashSet();
		hashSet.add(str);
		hashSet.add(str1);

		hashSet.forEach(System.out::println);
	}

}
