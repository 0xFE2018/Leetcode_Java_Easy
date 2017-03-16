package com.leetcode.easy;

import java.util.Stack;

public class ValidParenthesis {

	public boolean isValid(String s) {

		char[] arr = s.toCharArray();
		Stack<Character> stack = new Stack<Character>();

		for (char c : arr) {

			if (c == '(' || c == '{' || c == '[' || c == '<')
				stack.push(c);

			else if (stack.isEmpty() || ((c == ')' && stack.pop() != '(') || (c == '}' && stack.pop() != '{')
					|| (c == ']' && stack.pop() != '[') || (c == '>' && stack.pop() != '<')))

				return false;

		}

		return stack.isEmpty();

	}

	public static void main(String... args) {
		ValidParenthesis obj = new ValidParenthesis();
		System.out.println(obj.isValid("]"));
	}

}
