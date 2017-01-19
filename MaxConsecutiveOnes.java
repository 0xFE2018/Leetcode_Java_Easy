package com.leetcode.easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaxConsecutiveOnes {

	
	public int findMaxConsecutiveOnes(int[] nums) {

		List<Integer> result = new ArrayList<Integer>();
		int previous = -1, count = 0;

		for (int num : nums) {
			if (num == 1) {
				if (previous == 1) {
					count++;
				} else {
					count = 1;
				}
			} else {
				if (previous == 1) {
					result.add(count);
					count = 0;
				}
			}
			
			previous=num;
		}
		
		if(count>0){
			result.add(count);
		}
     
		return !result.isEmpty()?Collections.max(result):0;
	}

}
