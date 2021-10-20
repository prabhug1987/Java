package com.example.innerclasses;

public class StaticInnerClass {
	
	static int data = 20;
	static class Inner{
		void msg() {
			System.out.println("data is "+ data);
		}
	}
	
	public static void main(String[] args) {
		StaticInnerClass.Inner staticInner = new StaticInnerClass().Inner();
		staticInner.msg();
	}

}
