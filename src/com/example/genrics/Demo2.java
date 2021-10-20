package com.example.genrics;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Demo2 {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		set.add(1);
		Iterator<Integer> it = set.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());

		}

		for (Integer s : set) {
			System.out.println(s);

		}

	}
}
