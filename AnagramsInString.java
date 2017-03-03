package com.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class AnagramsInString {

	public static void main(String[] args) {

		
		
	}

	public List<Integer> findAnagrams(String s, String p) {

		List<Integer> list = new ArrayList<Integer>();

		if (s == null || p == null || s.isEmpty() || p.isEmpty())
			return list;

		int[] hash = new int[256];

		for (char c : p.toCharArray()) {
			hash[c]++;
		}

		int count = p.length(), left = 0, right = 0;

		while (right < s.length()) {

			if (hash[s.charAt(right)] >= 1) {
				count--;
			}
			hash[s.charAt(right)]--;
			right++;

			if (count == 0)
				list.add(left);

			if (right - left == p.length()) {

				if (hash[s.charAt(left)] >= 0) {
					count++;
				}
				hash[s.charAt(left)]++;
				left++;
			}

		}

		return list;

	}

}
