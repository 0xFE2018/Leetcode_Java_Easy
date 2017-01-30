package com.leetcode.easy;

public class ValidPerfectSquare {

	public static void main(String... args) {

	}

	public boolean isPerfectSquare(int num) {
      
		int i=1;
		
		while(num>0){
			num-=i;
			i+=2;
		}
		
		return num==0;
	}

}
