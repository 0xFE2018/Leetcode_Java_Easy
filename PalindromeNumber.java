package com.sort.example;

public class PalindromeNumber {

	public static void main(String... args) {
      
		PalindromeNumber obj= new PalindromeNumber();
		System.out.println(obj.isPalindrome(12212));
		
	}

	public boolean isPalindrome(int x) {

		int num=0;
		int target=x;
		while(x>0){
			num=num*10+x%10;
			x=x/10;
			
		}
		
		return num==target;
	}

}
