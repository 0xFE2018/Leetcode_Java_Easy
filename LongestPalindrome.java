package com.leetcode.easy;

import java.util.HashSet;

public class LongestPalindrome {

	public int longestPalindrome(String s) {

		if (s == null || s.isEmpty())
			return 0;
		int count = 0;
		HashSet<Character> set = new HashSet<Character>();

		for (char ch : s.toCharArray()) {
			if (set.contains(ch)) {
				set.remove(ch);
				count++;
			} else {
				set.add(ch);
			}
		}

		if (set.isEmpty())
			return count * 2;

		return count * 2 + 1;

	}
}
