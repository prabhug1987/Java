package com.example.string.conversion;

public class StringToObject {
	
	public static void main(String[] args) {
		String s = "hello";
		// assinged a string value to a object class value
		Object obj= s;
		System.out.println(obj);
		
		//load a class using class.forname method
		
		try {
			
			Class c = Class.forName("java.lang.String");
			System.out.println("class name "+ c.getName());
			//pring the super class name
			System.out.println("super class name"+ c.getSuperclass().getName());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
