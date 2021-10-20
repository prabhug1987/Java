package com.example.reflect;

import java.lang.reflect.Method;

public class Example1 {
	
	
	public static void main(String[] args) {
		Class example= Example1.class;
		
		System.out.println(example.getName());
		Method[] methods = example.getMethods();
		
		for (Method method : methods) {
			System.out.println(method.getName());
		}
		
	}
	
	void method1() {
		
	}
	

}
