package com.example.Collections;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class SingletonSetExample {
	
	public static void main(String[] args) {
		
	}

	public Set<Integer> getNumbers() {
		if(false) {
			Set<Integer> setNumbers = new HashSet<>();
			setNumbers.add(123);
			setNumbers.add(789);
			return setNumbers;
		}else {
			return Collections.emptySet();
		}
	}
}
