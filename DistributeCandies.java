package com.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class DistributeCandies {

	public static void main(String... args) {
		DistributeCandies obj = new DistributeCandies();
		System.out.println(obj.distributeCandies(new int[] { 1,1,2,2,3,3}));
	}

	public int distributeCandies(int[] candies) {

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int candy : candies) {
			if (map.containsKey(candy)) {
				map.put(candy, map.get(candy) + 1);
			} else {
				map.put(candy, 1);
			}
		}

		if (map.keySet().size() <= candies.length / 2) {
			return map.keySet().size();
		} else {
			return candies.length / 2;
		}

	}
}
