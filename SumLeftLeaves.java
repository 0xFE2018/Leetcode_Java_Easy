package Easy;

import java.util.Stack;

public class SumLeftLeaves {

	public static void main(String[] args) {
		SumLeftLeaves obj = new SumLeftLeaves();
		TreeNode root = new TreeNode(1);
		TreeNode one = new TreeNode(2);
		TreeNode two = new TreeNode(3);
		TreeNode three = new TreeNode(4);
		TreeNode four = new TreeNode(5);
		root.left = one;
		root.right = two;
		one.left = three;
		one.right = four;
		System.out.println(obj.sumOfLeftLeaves(root));
	}

	public int sumOfLeftLeaves(TreeNode root) {
		int sum = 0;

		Stack<TreeNode> stack = new Stack<TreeNode>();

		stack.push(root);

		while (!stack.isEmpty()) {
			TreeNode node = stack.pop();
			if (node.left != null && node.left.left == null
					&& node.left.right == null) {
				sum += node.left.val;
			}

			if (node.left != null) {
				stack.push(node.left);
			}

			if (node.right != null) {
				stack.push(node.right);
			}
		}

		return sum;
	}

}
