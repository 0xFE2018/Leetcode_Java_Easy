package com.leetcode.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ContainsDuplicateTwo {

	public boolean containsNearbyDuplicate(int[] nums, int k) {

		Map<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();

		for (int i = 0; i < nums.length; i++) {

			if (map.containsKey(nums[i])) {
				for (int index : map.get(nums[i])) {
					if (Math.abs(index - i) <= k) {
						return true;
					}
				}

				map.get(nums[i]).add(i);
			} else {
				List<Integer> list = new ArrayList<Integer>();
				list.add(i);
				map.put(nums[i], list);
			}

		}

		return false;
	}

	public static void main(String... args) {
		ContainsDuplicateTwo obj = new ContainsDuplicateTwo();
		System.out.println(obj.containsNearbyDuplicate(new int[] { 1, 2, 1 }, 0));
	}

}
