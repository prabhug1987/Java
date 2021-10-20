package com.example.innerclasses;


abstract class Person{
	abstract void eat();
}
public class TestAnonymousInner {
		
	public static void main(String[] args) {
		Person p = new Person() {

			@Override
			void eat() {
				// TODO Auto-generated method stub
				System.out.println("nice fruits");
			}
			
		};

		p.eat();
	}
}
