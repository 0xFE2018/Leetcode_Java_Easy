package com.leetcode.easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class IsomorphicStrings {

	public static void main(String... args) {
		IsomorphicStrings obj = new IsomorphicStrings();
		System.out.println(obj.isIsomorphic("ab", "aa"));
	}

	public boolean isIsomorphic(String s, String t) {

		if (s == null || t == null)
			return false;

		if (s.length() != t.length())
			return false;
		char[] sArr = s.toCharArray();
		char[] tArr = t.toCharArray();

		Map<Character, Character> map = new HashMap<Character, Character>();
		Set<Character> temp;

		for (int i = 0; i < sArr.length; i++) {
			if (map.containsKey(sArr[i])) {
				if (!map.get(sArr[i]).equals(tArr[i]))
					return false;
				else
					continue;
			}

			temp = new HashSet<Character>(map.values());
			if (!temp.add(tArr[i])) {
				return false;
			}

			map.put(sArr[i], tArr[i]);
		}

		return true;
	}

}
