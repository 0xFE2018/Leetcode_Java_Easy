package com.leetcode.easy;

public class ClimbingStairs {

	public int climbStairs(int n) {
      
		int n1=1,n2=2,n3=0;
		
		if(n==1) return n1;
		if(n==2) return n2;
		
		for(int i=2;i<n;i++){
			n3=n1+n2;
			n1=n2;
			n2=n3;
		}
		
		return n3;
	}

}
