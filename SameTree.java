package com.leetcode.easy;

import java.util.Stack;

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
	}

	@Override
	public String toString() {
		return String.valueOf(val);
	}
}

public class SameTree {

	public boolean isSameTree(TreeNode p, TreeNode q) {

		Stack<TreeNode> stackP = new Stack<TreeNode>();
		Stack<TreeNode> stackQ = new Stack<TreeNode>();

		stackP.push(p);
		stackQ.push(q);

		while (!stackP.isEmpty() && !stackQ.isEmpty()) {

			TreeNode nodeP = stackP.pop();
			TreeNode nodeQ = stackQ.pop();

			if ((nodeP == null && nodeQ != null)
					|| (nodeP != null && nodeQ == null)) {
				return false;
			}

			if (nodeP == null && nodeQ == null) {
				continue;
			}

			if (nodeP.val != nodeQ.val) {
				return false;
			}

			stackP.push(nodeP.left);
			stackP.push(nodeP.right);
			stackQ.push(nodeQ.left);
			stackQ.push(nodeQ.right);

		}

		if (stackP.isEmpty() && stackQ.isEmpty())
			return true;

		else
			return false;

	}

}
