package com.leetcode.easy;

public class NumSegmentsInString {

	public int countSegments(String s) {

		int count = 0;
		s = s.trim();

		if (s == null || s.isEmpty())
			return count;

		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) == ' ' && s.charAt(i - 1) != ' ') {
				
				count++;
			}

		}

		return count + 1;
	}

}
