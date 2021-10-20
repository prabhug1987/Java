package com.example.collection;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		Map< Integer, String> map = new HashMap<>();
		
		map.put(1, "Alive");
		map.put(1, "is");
		map.put(1, "awesome");
		
		Map<Integer,String> syncMap = Collections.synchronizedMap(map);
		System.out.println("Synchronized map "+ syncMap);
		
		Map<String, String> premiumPhone = new HashMap<String, String>();
		premiumPhone.put("Apple", "iPhone");
		premiumPhone.put("HTC", "HTC one");
		premiumPhone.put("Samsung", "S5");

		Iterator iterator = premiumPhone.keySet().iterator();

		while (iterator.hasNext()) {
			System.out.println(premiumPhone.get(iterator.next()));
			premiumPhone.put("Sony", "Xperia Z");
		}

	}
}
