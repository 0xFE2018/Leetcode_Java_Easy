package com.leetcode.easy;

public class CountPrimes {

	public int countPrimes(int n) {

		if (n <= 1)
			return 0;

		boolean[] notPrimes = new boolean[n];

		notPrimes[0] = true;
		notPrimes[1] = true;

		for (int i = 2; i < Math.sqrt(n); i++) {
			if (!notPrimes[i]) {
				for (int j = 2; j * i < n; j++) {
					notPrimes[i * j] = true;
				}
			}
		}

		int count = 0;

		for (int i = 2; i < notPrimes.length; i++) {
			if (!notPrimes[i])
				count++;
		}

		return count;

	}

}
