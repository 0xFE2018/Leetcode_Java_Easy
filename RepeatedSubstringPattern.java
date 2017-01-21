package com.leetcode.easy;

public class RepeatedSubstringPattern {

	public static void main(String... args) {
		RepeatedSubstringPattern obj = new RepeatedSubstringPattern();
		System.out.println(obj.repeatedSubstringPattern("abababababababab"));
	}

	public boolean repeatedSubstringPattern(String str) {

		int l = str.length();

		for (int i = l / 2; i >= 1; i--) {
			if (l % i == 0) {
				int m = l / i;
				String subStr = str.substring(0, i);
				StringBuilder sb = new StringBuilder();
				for (int j = 0; j < m; j++) {
					sb.append(subStr);
				}

				if (str.equals(sb.toString())) {
					return true;
				}
			}
		}

		return false;
	}
}
