package com.sort.example;

import java.util.Stack;

public class QueueUsingStack {

	Stack<Integer> queue = new Stack<Integer>();
	Stack<Integer> temp = new Stack<Integer>();

	public static void main(String[] args) {

		QueueUsingStack obj = new QueueUsingStack();
		obj.push(1);
		obj.push(2);
		obj.push(3);
		System.out.println(obj.pop());
		System.out.println(obj.pop());
		System.out.println(obj.peek());
		System.out.println(obj.empty());

	}

	/** Initialize your data structure here. */
	public QueueUsingStack() {

	}

	/** Push element x to the back of queue. */
	public void push(int x) {

		while (!temp.isEmpty())
			queue.push(temp.pop());

		queue.push(x);
	}

	/** Removes the element from in front of queue and returns that element. */
	public int pop() {

		while (!queue.isEmpty())
			temp.push(queue.pop());

		return temp.pop();
	}

	/** Get the front element. */
	public int peek() {
		while (!queue.isEmpty())
			temp.push(queue.pop());

		return temp.peek();
	}

	/** Returns whether the queue is empty. */
	public boolean empty() {
		return queue.isEmpty() && temp.isEmpty();
	}
}
