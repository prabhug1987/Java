package com.example.genrics;

import java.util.ArrayList;
import java.util.List;

public class GenricsTest {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(new Integer(2));
		list.add("string");
		
		Integer integer = (Integer) list.get(0);
		String string   = (String) list.get(1);
		
		for (Object object : list) {
			System.out.println(object);
		}
		
	}
}
