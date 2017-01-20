package com.leetcode.easy;

import java.util.HashSet;
import java.util.Set;

public class HappyNumbers {

	public boolean isHappy(int n) {

		Set<Integer> set = new HashSet<Integer>();

		int square = 0;

		while (set.add(n)) {

			while (n > 0) {
				int rem = n % 10;
				square += rem * rem;
				n = n / 10;
			}
			
			if(square==1) return true;
			else n=square;
		}
		
		return false;

	}

}
