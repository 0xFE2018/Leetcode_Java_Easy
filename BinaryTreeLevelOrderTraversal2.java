package com.leetcode.easy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal2 {

	public List<List<Integer>> levelOrderBottom(TreeNode root) {

		List<List<Integer>> listOfNodes = new ArrayList<List<Integer>>();

		if (root == null)
			return listOfNodes;

		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.offer(root);

		while (!queue.isEmpty()) {
			int levelNumber = queue.size();

			List<Integer> subList = new ArrayList<Integer>();

			for (int i = 0; i < levelNumber; i++) {
				if (queue.peek().left != null) {
					queue.add(queue.peek().left);
				}

				if (queue.peek().right != null) {
					queue.add(queue.peek().right);
				}

				subList.add(queue.poll().val);
			}

			listOfNodes.add(0,subList);
			
		}

		return listOfNodes;
	}

}
