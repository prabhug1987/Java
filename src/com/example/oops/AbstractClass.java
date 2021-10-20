package com.example.oops;

public abstract class AbstractClass {
	// is not allow for abstract method
	strictfp abstract void method1();
	
	// not allowed for data member
	strictfp int data = 10;
	
	//not allowed for constructor
	strictfp AbstractClass() {
		
	}
}
