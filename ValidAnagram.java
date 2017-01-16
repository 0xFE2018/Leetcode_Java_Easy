package com.leetcode.easy;

public class ValidAnagram {

	public static void main(String[] args) {

	}

	public boolean isAnagram(String s, String t) {

		if (s == null || t == null || s.length() != t.length()) {
			return false;
		}

		int[] letters = new int[26];

		for (int i = 0; i < s.length(); i++) {
			letters[s.charAt(i) - 'a'] += 1;
			letters[t.charAt(i) - 'a'] -= 1;
		}

		for (int count : letters) {
			if (count != 0) {
				return false;
			}
		}

		return true;
	}

}
