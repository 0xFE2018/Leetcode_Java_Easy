package com.leetcode.easy;

public class MaximumSubarray {

	public int maxSubArray(int[] nums) {

		int newSum = nums[0];
		int max = nums[0];

		for (int i = 1; i < nums.length; i++) {
			newSum = Math.max(newSum + nums[i], nums[i]);
			max = Math.max(newSum, max);
		}

		return max;

	}

}
