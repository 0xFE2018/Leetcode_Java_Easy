package com.leetcode.easy;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class LowestCommonAncestorBinarySearchTree {

	Stack<TreeNode> pStack = new Stack<TreeNode>();
	Stack<TreeNode> qStack = new Stack<TreeNode>();

	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

		findNode(root, p, pStack);
		findNode(root, q, qStack);

		Set<TreeNode> set = new HashSet<TreeNode>(pStack);

		while (!qStack.isEmpty()) {
			TreeNode temp = qStack.pop();
			if (!set.add(temp)) {
				return temp;
			}
		}

		return null;
	}

	public void findNode(TreeNode root, TreeNode target, Stack<TreeNode> stack) {
		if (root == null)
			return;
		
		stack.push(root);
		
		if (root.val > target.val) {
			root = root.left;
		} else if(root.val < target.val) {
			root = root.right;
		}else{
			return;
		}

		findNode(root, target, stack);
	}

}
