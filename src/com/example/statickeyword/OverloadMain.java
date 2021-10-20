package com.example.statickeyword;

public class OverloadMain {
	
	//overloading main method
	public static void main(String[] args) {
		System.out.println("main method");
		main();
	}
	// overloaded main method
	static void main() {
		System.out.println("main method without ags");
	}

	
}
