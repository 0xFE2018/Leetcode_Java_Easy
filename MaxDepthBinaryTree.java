package Easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
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
		// TODO Auto-generated method stub
		return String.valueOf(val);
	}
}

public class MaxDepthBinaryTree {

	List<Integer> depths = new ArrayList<Integer>();
	int depth;

	public static void main(String[] args) {

		MaxDepthBinaryTree obj = new MaxDepthBinaryTree();
		TreeNode root = new TreeNode(0);
		TreeNode one = new TreeNode(1);
		TreeNode two = new TreeNode(2);
		TreeNode three = new TreeNode(3);
		TreeNode four = new TreeNode(4);
		TreeNode five = new TreeNode(5);
		TreeNode six = new TreeNode(6);
		root.left = one;
		root.right = two;
		one.left = three;
		one.right = four;
		two.left = five;
		two.right = six;
		System.out.println(obj.maxDepth(root));

	}

	public int maxDepth(TreeNode root) {

		if (root == null)
			return 0;
		Stack<TreeNode> nodeStack = new Stack<TreeNode>();
		Stack<Integer> value = new Stack<Integer>();

		nodeStack.push(root);
		value.push(1);
        int max=0;
		while (!nodeStack.isEmpty()) {
           TreeNode node= nodeStack.pop();
           int temp= value.pop();
           max= Math.max(temp,max);
           
           if(node.left!=null){
        	   nodeStack.push(node.left);
        	   value.push(temp+1);
           }
           
           if(node.right!=null){
        	   nodeStack.push(node.right);
        	   value.push(temp+1);
           }
		}
		
		return max;

	}

}
