package com.leetcode.easy;

public class ReverseString {

	public static void main(String... args) {
		ReverseString obj = new ReverseString();
		System.out.println(obj.reverseWords("Let's take LeetCode contest"));
	}

	public String reverseWords(String s) {

		StringBuilder builder = new StringBuilder();
		String[] strArr = s.split(" ");
		for (int k = 0; k < strArr.length; k++) {
			char[] arr = strArr[k].toCharArray();
			int i = 0, j = arr.length - 1;

			while (i < j) {
				char temp = arr[i];
				arr[i++] = arr[j];
				arr[j--] = temp;
			}

			if (!(k == 0))
				builder.append(" ");
			builder.append(new String(arr));
		}

		return builder.toString();
	}

}
