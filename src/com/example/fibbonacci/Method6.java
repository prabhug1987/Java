package com.example.fibbonacci;

public class Method6 {
	static int MAX = 1000;
	static int[] f;

	static int fib(int n) {
		// Base case
		if (n == 0)
			return 0;

		if (n == 1 || n == 2)
			return (f[n] = 1);

		// if fib(n) is already computed
		if (f[n] != 0)
			return f[n];

		int k = (n & 1) == 1 ? (n + 1) / 2 : n / 2;

		// Applyting above formula [Note value
		// n&1 is 1 if n is odd, else 0.
		f[n] = (n & 1) == 1 ? (fib(k) * fib(k) + fib(k - 1) * fib(k - 1)) : (2 * fib(k - 1) + fib(k)) * fib(k);

		return f[n];
	}

	public static void main(String[] args) {

		int n = 9;
		f = new int[MAX];
		System.out.println(fib(n));
	}
}
