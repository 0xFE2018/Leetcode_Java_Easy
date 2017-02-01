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

	public static void main(String... args) {

		SymmetricTree obj = new SymmetricTree();
		TreeNode root = new TreeNode(0);
		TreeNode one = new TreeNode(1);
		TreeNode two = new TreeNode(1);
		TreeNode three = new TreeNode(3);
		TreeNode four = new TreeNode(4);
		TreeNode five = new TreeNode(4);
		//TreeNode six = new TreeNode(5);
		root.left = one;
		root.right = two;
		one.left = three;
		one.right = four;
		two.left = five;
		//two.right = six;
		System.out.println(obj.isSymmetric(root));
	}

}
