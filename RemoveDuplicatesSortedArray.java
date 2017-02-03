package com.leetcode.easy;

public class RemoveDuplicatesSortedArray {

	public int removeDuplicates(int[] nums) {
		
		if(nums==null || nums.length==0) return 0;
		
		int i = 0;

		for (int j = 1; j < nums.length; j++) {
			if (nums[j] != nums[j - 1]) {

				nums[i++] = nums[j - 1];
			}

			if (j == nums.length - 1) {
				nums[i] = nums[j];
			}

		}
		
		
		return i+1;
	}
	
	
	public static void main(String...args){
		
		RemoveDuplicatesSortedArray obj= new RemoveDuplicatesSortedArray();
		System.out.println(obj.removeDuplicates(new int[]{1,1,2,2,3,4,5,5,5}));
	}
	
}
