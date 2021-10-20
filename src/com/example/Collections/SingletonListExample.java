package com.example.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SingletonListExample {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>(Collections.nCopies(1000,(String)null));
		list.forEach(li->System.out.println(li));
		System.out.println(list.size());
		list.addAll(Collections.nCopies(100,(String)null));
		list.forEach(li->System.out.println(li));
		System.out.println(list.size());
		
		List<String> listNames = new ArrayList<>(Arrays.asList("Prabhu","Nagu","mani","Prabhu"));
		System.out.println("before remove"+listNames);
		listNames.removeAll(Collections.singletonList("Prabhu"));
		System.out.println("after remove"+listNames);
	}

	public List getCountries() {
		List<String> listCountries = Arrays.asList("USA","UK");
		
		if(listCountries== Collections.EMPTY_LIST) {
			System.out.println("Empty list : no country");
		}
		
		if(listCountries.isEmpty())
			System.out.println("Empty list : no country");
		
		if(listCountries.size() == 0) {
			return Collections.EMPTY_LIST;
		}
				
		return listCountries;
	}

}
