package com.leetcode.easy;

public class ArrangingCoins {

	public int arrangeCoins(int n) {
      
		return (int)(-1+Math.sqrt(1+8*(long)n))/2;
		
		
		
		
	}
	
	public static void main(String...args){
		ArrangingCoins obj= new ArrangingCoins();
		System.out.println(obj.arrangeCoins(8));
		
		
	}

}
