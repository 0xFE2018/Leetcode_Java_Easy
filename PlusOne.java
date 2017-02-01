package com.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class PlusOne {

	public int[] plusOne(int[] digits) {

		int carry = 0, sum = 0;

		List<Integer> list = new ArrayList<Integer>();

		for (int i = digits.length - 1; i >= 0; i--) {

			sum = digits[i] + carry;

			if (i == digits.length - 1) {

				sum += 1;
			}

			carry = sum / 10;
			sum = sum % 10;

			list.add(0, sum);

		}

		if (carry != 0) {
			list.add(0, carry);
		}

		int nums[] = new int[list.size()];

		for (int i = 0; i < list.size(); i++) {
			nums[i] = list.get(i);
		}
		return nums;
	}

	public static void main(String... args) {
		PlusOne obj = new PlusOne();
		int[] nums = obj.plusOne(new int[] { 1, 0 });

		for (int num : nums) {
			System.out.println(num);
		}
	}

}
