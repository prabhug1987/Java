package com.example.finals;

public class FinalObjectexample {

	final static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) {
		sb.append("hello");
		System.out.println(sb.toString());
		sb.append("java");
		System.out.println(sb.toString());
		
		foo(new int[] {1,2,35,6});
		int[] ints = new int[] {12,34,21,31};
		// final local variable cannot be assigned
		//it must be blank not using a compound assignment
		
		for(final int j = 0; j <ints.length; j++) {
			System.out.println(j);
		}
	}

	static void foo(int[] ints) {
		//local final variables
		final int x = 10;
		final boolean flag;
		flag = true;

		for (final int i : ints) {
			System.out.println(i);
		}
	}

}
