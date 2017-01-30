package com.leetcode.easy;

public class ReverseVowels {

	public static void main(String... args) {
		ReverseVowels obj = new ReverseVowels();
		System.out.println(obj.reverseVowels("Euston saw I was not Sue."));
	}

	public String reverseVowels(String s) {

		int forwardPtr = -1;
		int reversePtr = -1;
		int i = 0, j = s.length() - 1;

		char[] charArr = s.toCharArray();

		while (i < j) {
			if (findVowel(charArr, i) || findVowel(charArr, j)) {

				if (forwardPtr == -1 && findVowel(charArr, i)) {
					forwardPtr = i;
				}

				if (reversePtr == -1 && findVowel(charArr, j)) {
					reversePtr = j;
				}

				if (forwardPtr != -1 && reversePtr != -1) {
					char temp = charArr[forwardPtr];
					charArr[forwardPtr] = charArr[reversePtr];
					charArr[reversePtr] = temp;
					forwardPtr = -1;
					reversePtr = -1;
				}

			}
			
			if (forwardPtr == -1) i++;
			if (reversePtr == -1) j--;

		}

		return new String(charArr);

	}

	public boolean findVowel(char[] arr, int index) {
		return arr[index] == 'a' || arr[index] == 'e' || arr[index] == 'i'
				|| arr[index] == 'o' || arr[index] == 'u' || arr[index] == 'A'
				|| arr[index] == 'E' || arr[index] == 'I' || arr[index] == 'O'
				|| arr[index] == 'U';
	}
}
