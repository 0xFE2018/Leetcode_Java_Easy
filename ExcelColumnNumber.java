package com.leetcode.easy;

public class ExcelSheetColumnNumber {
	public int titleToNumber(String s) {
      
		char [] charArr= s.toCharArray();
		int result=0;
		for(int i=0;i<charArr.length;i++){
			
			result= result*26+((charArr[i]-'A')+1);
			
		}
		
		return result;
		
	}
}
