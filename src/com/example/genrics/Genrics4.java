package com.example.genrics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Genrics4 {

	public static <T> T addAndReturn(T element,Collection<T> collection) {
		collection.add(element);
		return element;
	}
	
	public static void main(String[] args) {
	
		String stringElement = "string element";
		List<String> stringList = new ArrayList<String>();
		
		Integer integer = new  Integer(123);
		List<Integer> integerList = new ArrayList<Integer>();
		
		Integer theElement = addAndReturn(integer,integerList);
		
		Object objectElement = new Object();
		
		Object theElement = addAndReturn(objectElement, stringList);
		
		String string = getInstance(String.class);
		
		
	}
	
	public static <T> T getInstance(Class<T> theClass) throws IllegalAccessException, InstantiationException{
		return theClass.newInstance();
	}
	
	public static <T> T read(Class<T> theClass, String sql) throws InstantiationException, IllegalAccessException {
		T o = theClass.newInstance();
		return o;
		
	}
}
