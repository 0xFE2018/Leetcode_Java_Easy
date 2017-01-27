package com.leetcode.easy;

public class SearchInsertPosition {

	public int searchInsert(int[] nums, int target) {
       
		if(nums==null || nums.length==0){
			return -1;
		}
		
		return binarySearch(nums,target, 0, nums.length);
		
	}

	public int binarySearch(int nums[], int num, int low, int high) {

		if (low < high) {
			int mid = (low + high) / 2;

			if (num < nums[mid]) {
				return binarySearch(nums, num, low, mid-1);
			} else if (num > nums[mid]) {
				return binarySearch(nums, num, mid + 1, high);
			} else {
				return mid;
			}
		}

		return low;
	}
	
	public static void main(String...args){
		SearchInsertPosition obj= new SearchInsertPosition();
		System.out.println(obj.binarySearch(new int[] {1,3}, 2, 0, 1));
	}
	
}
