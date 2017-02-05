package com.sort.example;

public class FactorialTrailingZeros {

	public static void main(String... args) {
		FactorialTrailingZeros obj = new FactorialTrailingZeros();
		System.out.println(obj.trailingZeroes(5));
	}

	public int trailingZeroes(int n) {

		int zeros = 0;
		int i = 1;

		while ((n / Math.pow(5, i)) >= 1) {

			zeros += (n / (int) Math.pow(5, i));
			i++;

		}
		return zeros;
	}

}
