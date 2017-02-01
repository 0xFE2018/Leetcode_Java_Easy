package com.leetcode.easy;

public class SymmetricTree {

	public boolean isSymmetric(TreeNode root) {
		
		if(root==null) return true;
		
		return checkSymmetry(root.left, root.right);
	}

	public boolean checkSymmetry(TreeNode nodeLeft, TreeNode nodeRight) {

		if (nodeLeft != null && nodeRight != null
				&& nodeLeft.val == nodeRight.val) {

			return checkSymmetry(nodeLeft.left, nodeRight.right)
					&& checkSymmetry(nodeLeft.right, nodeRight.left);

		} else if(nodeLeft == null && nodeRight == null){
			return true;
		}
		else {
			return false;
		}

	}

}
