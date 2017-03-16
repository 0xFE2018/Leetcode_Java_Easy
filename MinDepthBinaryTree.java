package com.leetcode.easy;

public class MinDepthBinaryTree {

	int min;

	public int minDepth(TreeNode root) {
		int depth = 0;

		findDepth(root, depth);

		return min;
	}

	private void findDepth(TreeNode node, int depth) {

		if (node == null)
			return;
            
		depth++;
		
		if (node.left == null && node.right == null) {
			if (min == 0 || depth < min) {
				min = depth;
			}
		}

		findDepth(node.left, depth);
		findDepth(node.right, depth);

	}
}
