package Easy;

import java.util.Stack;

public class InvertBinaryTree {


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
