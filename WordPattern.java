package com.leetcode.easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class WordPattern {

	public boolean wordPattern(String pattern, String str) {

		if (pattern == null || str == null)
			return false;

		char[] patternArr = pattern.toCharArray();

		String[] strArr = str.split(" ");

		if (patternArr.length != strArr.length)
			return false;

		Map<Character, String> map = new HashMap<Character, String>();
		Set<String> set;

		for (int i = 0; i < patternArr.length; i++) {

			if (map.containsKey(patternArr[i])) {
				if (!map.get(patternArr[i]).equals(strArr[i])) {
					return false;
				}
			} else {
				set = new HashSet<String>(map.values());

				if (!set.add(strArr[i])) {
					return false;
				}
				map.put(patternArr[i], strArr[i]);
			}

		}
		return true;
	}

	public static void main(String... args) {
		WordPattern obj = new WordPattern();
		System.out.println(obj.wordPattern("abba", "dog dog dog dog"));
	}

}
