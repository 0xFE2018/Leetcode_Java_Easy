package com.leetcode.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArrayIntersectionTwo {

	public static void main(String[] args) {

	}

	public int[] intersect(int[] nums1, int[] nums2) {

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int num : nums1) {
			if (map.containsKey(num)) {
				map.put(num, map.get(num) + 1);
			} else {
				map.put(num, 1);
			}
		}

		List<Integer> result = new ArrayList<Integer>();

		for (int num : nums2) {

			if (map.containsKey(num) && map.get(num) > 0) {
				result.add(num);
				map.put(num, map.get(num) - 1);
			}
		}

		int[] resultArr = new int[result.size()];
		for (int i = 0; i < result.size(); i++) {
			resultArr[i] = result.get(i);
		}

		return resultArr;
	}

}
