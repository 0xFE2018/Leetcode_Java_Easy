package com.leetcode.easy;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
   public static void main(String...args){
	   
   }
   
   public boolean containsDuplicate(int[] nums) {
	   
	   Set<Integer> set = new HashSet<Integer>();
		 for(int i : nums)
			 if(!set.add(i))// if there is same
				 return true; 
		 return false;
   }
   
}
