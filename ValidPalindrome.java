package com.leetcode.easy;

public class ValidPalindrome {

	public boolean isPalindrome(String s) {

		s = s.trim();
		s = s.replaceAll("[^a-zA-Z0-9\\s]", "");
		s = s.replaceAll(" ", "");
		s = s.toLowerCase();

		int i = 0, j = s.length()-1;

		while (i < j) {
         
			if(s.charAt(i)!=s.charAt(j)){
				return false;
			}
			
			i++;
			j--;
		}

		return true;
	}

}
