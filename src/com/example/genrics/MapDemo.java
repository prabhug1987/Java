package com.example.genrics;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		Map map = new HashMap<>();
		map.put(1, "Prabhu");
		
		Iterator<Integer> keyIterator = map.keySet().iterator();
		while (keyIterator.hasNext()) {
			System.out.println(map.get(keyIterator.next()));
			
		}
		
		Iterator<String> valueIterator = map.values().iterator();
		while (valueIterator.hasNext()) {
			System.out.println(valueIterator.next());
			
		}
		
		
	}
}
