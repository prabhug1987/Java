package com.example.innerclasses;

public class TestMemberOuter {
	
	private int data = 30;
	
	class inner{
		void msg() {
			System.out.println("data is "+ data);
		}
	}
	
	public static void main(String args[]) {
		TestMemberOuter testMemberOuter = new TestMemberOuter();
		TestMemberOuter.inner in = testMemberOuter.new inner();
	}

}
