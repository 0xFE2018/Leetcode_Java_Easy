package com.leetcode.easy;

public class BinarySearch {

	public static void main(String[] args) {
		BinarySearch obj = new BinarySearch();
		System.out.println(obj.binarySearch(new int[] { 1, 2, 5, 7, 11, 23, 32,
				43 }, 32, 0, 7));

	}

	public int binarySearch(int nums[], int num, int low, int high) {

		if (low < high) {
			int mid = (low + high) / 2;

			if (num < nums[mid]) {
				return binarySearch(nums, num, low, mid - 1);
			} else if (num > nums[mid]) {
				return binarySearch(nums, num, mid + 1, high);
			} else {
				return mid;
			}
		}

		return -1;
	}

}
