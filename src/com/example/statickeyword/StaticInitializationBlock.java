package com.example.statickeyword;

// run a program without static method in java
class StaticInitializationBlock {
	static {
		System.out.println("class without a main method");
		System.exit(0);
	}
}