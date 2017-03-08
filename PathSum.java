package com.leetcode.easy;

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.valueOf(val);
	}
}

public class PathSum {

	int add;
	boolean flag;

	public static void main(String... args) {

		PathSum obj = new PathSum();
		TreeNode root = new TreeNode(1);
		TreeNode one = new TreeNode(-2);
		TreeNode two = new TreeNode(3);
		/*
		 * TreeNode three = new TreeNode(4); TreeNode four = new TreeNode(5);
		 * TreeNode five = new TreeNode(6); TreeNode six = new TreeNode(7);
		 */
		root.left = one;
		root.right = two;
		/*
		 * one.left = three; one.right = four; two.left = five; two.right = six;
		 */
		System.out.println(obj.hasPathSum(root, 4));

	}

	public boolean hasPathSum(TreeNode root, int sum) {

		if (!flag && root!=null) {

			add += root.val;

			if (root.left == null && root.right == null) {

				if (add == sum)
					flag = true;
			}

			if (root.left != null)
				hasPathSum(root.left, sum);
			if (root.right != null)
				hasPathSum(root.right, sum);
			add -= root.val;
		}

		return flag;

	}

}
