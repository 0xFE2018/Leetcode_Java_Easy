package com.leetcode.easy;

public class MergeSortedArray {

	public void merge(int[] nums1, int m, int[] nums2, int n) {
	
		int i = m + n - 1, k = n - 1, l = m - 1;

		while (k >= 0 || l >= 0) {

			if (l == -1) {
				nums1[i--] = nums2[k--];
				continue;
			}

			if (k == -1) {
				break;
			}

			if (nums1[l] > nums2[k]) {
				nums1[i--] = nums1[l--];
			} else {
				nums1[i--] = nums2[k--];
			}
		}

	}

}
