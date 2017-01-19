package com.leetcode.easy;

public class AddStrings {
	
	public static void main(String...args){
		AddStrings obj= new AddStrings();
		System.out.println(obj.addStrings("408", "5"));
	}

	public String addStrings(String num1, String num2) {

		StringBuilder result = new StringBuilder();
		int carry = 0;

		int length1 = num1.length()-1;
		int length2= num2.length()-1;

		while(length1>-1 || length2>-1){
			
			int digit1, digit2, sum;
			
			digit1=length1>-1? num1.charAt(length1)-'0':0;
			digit2=length2>-1? num2.charAt(length2)-'0':0;

			sum = digit1 + digit2 + carry;
			carry=0;

			if (sum < 10) {
				result.insert(0,sum);
			} else {
				carry = 1;
				result.insert(0,sum % 10);
			}
			
			length1--;
			length2--;
		}

		if(carry>0){
			result.insert(0, carry);
		}
		
		return result.toString();

	}
}