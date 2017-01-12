package Easy;

import java.util.Stack;

public class InvertBinaryTree {

	public static void main(String[] args) {
 
		InvertBinaryTree obj = new InvertBinaryTree();
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
		System.out.println(obj.invertTree(root));
	}

	public TreeNode invertTree(TreeNode root) {
     
		if(root==null) return null;
		
		Stack<TreeNode> nodeStack= new Stack<TreeNode>();
		nodeStack.push(root);
		
		while(!nodeStack.isEmpty()){
			TreeNode node=nodeStack.pop();
			TreeNode temp= node.left;
			node.left=node.right;
			node.right=temp;
			
			if(node.left!=null){
				nodeStack.push(node.left);
			}
			
			if(node.right!=null){
				nodeStack.push(node.right);
			}
		}
		return root;
	}
	
	
}
