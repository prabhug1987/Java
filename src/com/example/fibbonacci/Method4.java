package com.example.fibbonacci;

public class Method4 {

	static int fib(int n) {
		int F[][] = new int[][] { { 1, 1 }, { 1, 0 } };
		if (n == 0)
			return 0;
		power(F, n - 1);

		return F[0][0];
	}

	private static void power(int[][] F, int n) {
		// TODO Auto-generated method stub
		int[][] M = new int[][] { { 1, 1 }, { 1, 0 } };

		for (int i = 2; i <= n; i++) {
			multiply(F, M);
		}

	}

	private static void multiply(int[][] F, int[][] M) {
		// TODO Auto-generated method stub
		int x = F[0][0] * M[0][0] + F[0][1] * M[1][0];
		int y = F[0][0] * M[0][1] + F[0][1] * M[1][1];
		int z = F[1][0] * M[0][0] + F[1][1] * M[1][0];
		int w = F[1][0] * M[0][1] + F[1][1] * M[1][1];

		F[0][0] = x;
		F[0][1] = y;
		F[1][0] = z;
		F[1][1] = w;

	}

	public static void main(String[] args) {

		int n = 9;
		System.out.println(fib(n));
	}
}
