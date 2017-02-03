package com.leetcode.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreePaths {

	public static void main(String[] args) {
		BinaryTreePaths obj = new BinaryTreePaths();
		TreeNode root = new TreeNode(0);
		TreeNode one = new TreeNode(1);
		TreeNode two = new TreeNode(2);
		TreeNode three = new TreeNode(3);
		TreeNode four = new TreeNode(4);
		TreeNode five = new TreeNode(5);
		TreeNode six = new TreeNode(6);
		root.left = one;
		root.right = two;
		one.left = three;
		one.right = four;
		two.left = five;
		two.right = six;
		System.out.println(obj.binaryTreePaths(root));
	}

	Stack<TreeNode> stack = new Stack<TreeNode>();
	List<String> paths = new ArrayList<String>();

	public List<String> binaryTreePaths(TreeNode root) {

		if (root != null)
			traverse(root);

		return paths;
	}

	public void traverse(TreeNode node) {

		stack.push(node);
		if (node.left == null && node.right == null) {

			StringBuilder builder = new StringBuilder("");

			for (TreeNode treeNode : stack) {
				builder.append(treeNode.val);

				if (stack.size() > 1
						&& stack.indexOf(treeNode) != stack.size() - 1)
					builder.append("->");
			}

			paths.add(builder.toString());
		}

		if (node.left != null)
			traverse(node.left);

		if (node.right != null)
			traverse(node.right);
		stack.pop();

	}

}
