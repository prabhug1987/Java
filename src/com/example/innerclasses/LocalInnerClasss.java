package com.example.innerclasses;

public class LocalInnerClasss {
	
	private int data = 20;
	 
	void display() {
		class Local{
			void msg() {
				System.out.println(data);
			}
		}
		
		Local l = new Local();
		l.msg();
	}
	
	public static void main(String[] args) {
		LocalInnerClasss localInnerClasss = new LocalInnerClasss();
		localInnerClasss.display();
	}

}
