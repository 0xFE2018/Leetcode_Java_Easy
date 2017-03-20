package com.leetcode.easy;

import java.util.LinkedList;
import java.util.Queue;

public class ImplementStackUsingQueue {

	Queue<Integer> queue;

	public static void main(String[] args) {
		ImplementStackUsingQueue obj = new ImplementStackUsingQueue();
		obj.push(1);
		obj.push(2);
		obj.push(3);
		int param_2 = obj.pop();
		int param_3 = obj.top();
		boolean param_4 = obj.empty();
		
		System.out.println(param_2+"------------> "+param_3+"--------------> "+param_4);

	}

	/** Initialize your data structure here. */
	public ImplementStackUsingQueue() {
		queue = new LinkedList<Integer>();
	}

	/** Push element x onto stack. */
	public void push(int x) {
		queue.add(x);
	}

	/** Removes the element on top of the stack and returns that element. */
	public int pop() {
		Queue<Integer> temp = new LinkedList<Integer>();
		int top = -1;
		if (!queue.isEmpty()) {
			while (queue.size() > 1) {
				temp.add(queue.poll());
			}

			top = queue.peek();
			queue = temp;
		}
		return top;
	}

	/** Get the top element. */
	public int top() {
		Queue<Integer> temp = new LinkedList<Integer>();
		int top = -1;
		while (!queue.isEmpty()) {
			top = queue.peek();
			temp.add(queue.poll());
		}
      
		queue=temp;
		
		return top;
	}

	/** Returns whether the stack is empty. */
	public boolean empty() {

		return queue.peek() == null;
	}

}
