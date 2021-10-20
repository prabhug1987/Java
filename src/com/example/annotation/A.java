package com.example.annotation;

class A {
	void m() {
		System.out.println("hello m");
	}

	@Deprecated
	void n() {
		System.out.println("hello n");
	}
}