package com.example.annotation;

import java.lang.reflect.Method;

public class TestCustomAnnotations {
	
	public static void main(String[] args) {
		Hello h  = new Hello();
		Method m;
		try {
			// get the method through reflection
			m = h.getClass().getMethod("sayHello");
			
			MyAnnotation myAnnotation= m.getAnnotation(MyAnnotation.class);
			System.out.println("value is "+ myAnnotation.value());
			
			
		} catch (NoSuchMethodException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
