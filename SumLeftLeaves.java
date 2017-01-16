package Easy;

import java.util.Stack;

public class SumLeftLeaves {

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
