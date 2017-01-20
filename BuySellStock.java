package com.leetcode.easy;

public class BuySellStock {

	public static void main(String[] args) {

	}

	public int maxProfit(int[] prices) {
      if(prices.length==0) return 0;
      
      int soFarMin=prices[0];
      int max=0;
      
      for(int i=0;i<prices.length;++i){
    	  if(prices[i]>soFarMin){
    		  Math.max(max,prices[i]-soFarMin);
    	  }else{
    		  soFarMin=prices[i];
    	  }
      }
    	return max; 
	}
}
