package BST;

import trees.TreeNode;

public class BstOrNot {
	
	static BstNode root;
	
	static int prev =  Integer.MIN_VALUE;
	
	static boolean isBst(BstNode root) {
		
		if(root == null) {
			return true;
		}
		
		if(!isBst(root.left)) {
			return false;
		}
		
		if(root.data < prev) {
			return false;
		}
		
		prev = root.data;
		
		return isBst(root.right);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		root =  new BstNode(3);
		root.left = new BstNode(2);
		root.right =  new BstNode(5);
		root.left.left =  new BstNode(1);
		
		System.out.println(isBst(root));

	}

}
