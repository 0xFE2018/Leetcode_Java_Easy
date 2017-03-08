package com.leetcode.easy;

public class PathSum {

	int add;
	boolean flag;

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
