package com.example.genrics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		String str = "star";
		list.add(str);
		
		String str2 = list.get(0);
		
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()) {
			String string = iterator.next();
			System.out.println(string);
		}
		
		for(String string : list) {
			System.out.println(string);
		}
		
		list.forEach(name -> System.out.println(name));
	}
}
