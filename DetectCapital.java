package com.leetcode.easy;

public class DetectCapital {

	public static void main(String[] args) {
		DetectCapital obj = new DetectCapital();
		System.out.println(obj.detectCapitalUse("AAA"));
	}

	public boolean detectCapitalUse(String word) {
		char[] charArr = word.toCharArray();
		if(word==null || word.length()<2){
			return true;
		}
		boolean a = false, b = false;
		for (int i = 0; i < charArr.length; i++) {
			if ((int) charArr[0] >= (int) 'A' && (int) charArr[0] <= (int) 'Z') {

				if (i != 0 && !((int) charArr[i] >= (int) 'a' && (int) charArr[i] <= (int) 'z')) {
					a = true;
				}

				if (i != 0 && !((int) charArr[i] >= (int) 'A' && (int) charArr[i] <= (int) 'Z')) {
					b = true;
				}

			} else {

				if (i != 0 && !((int) charArr[i] >= (int) 'a' && (int) charArr[i] <= (int) 'z')) {
					return false;
				}
			}

		}

		return !(a==true && b==true);
	}

}
