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

	public static void main(String... args) {
		MinDepthBinaryTree obj = new MinDepthBinaryTree();

		TreeNode root = new TreeNode(0);
		TreeNode one = new TreeNode(1);
		TreeNode two = new TreeNode(2);
		TreeNode three = new TreeNode(3);
		TreeNode four = new TreeNode(4);
		//TreeNode five = new TreeNode(5);
		//TreeNode six = new TreeNode(6);
		root.left = one;
		root.right = two;
		one.left = three;
		one.right = four;
		//two.left = five;
		//two.right = six;

		System.out.println(obj.minDepth(root));
	}
}
