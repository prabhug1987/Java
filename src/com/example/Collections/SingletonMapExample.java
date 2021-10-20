package com.example.Collections;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SingletonMapExample {

	public static void main(String[] args) {

		try {
			Map<String, String> map = Collections.singletonMap("key", "value");
			System.out.println("value of map is " + map);
			
			Map<Integer,Boolean> map1 = Collections.singletonMap(100, true);
		} catch (IllegalArgumentException e) {
			System.out.println("Exception thrown " + e);
		}
		
		Map<Integer,String> mapErrors = getErrors();
		if(mapErrors == Collections.EMPTY_MAP) {
			System.out.println("Empty map : No error found");
		}
		
	}
	
	public Map<Integer,String> getErrors(){
		if(false) {
			Map<Integer,String> mapErrors = new HashMap<>();
			mapErrors.put(500, "Internal server error");
			return mapErrors;
		}else {
			return Collections.emptyMap();
		}
	}

}
