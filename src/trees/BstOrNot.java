package trees;

public class BstOrNot {
	
	static TreeNode prev,root;
	
	static boolean isBST(TreeNode root) {
		
		if(root != null) {
			
			if(!isBST(root.left)) {
				return false;
			}
			
			if(prev != null && root.data <= prev.data) {
				return false;
			}
			
			prev = root;
			
			return isBST(root.right);
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		root = new TreeNode(3);
		root.left     = new TreeNode(2); 
	    root.right     = new TreeNode(5); 
	    root.left.left = new TreeNode(1); 
	    root.left.right = new TreeNode(4); 
	    
	    if (isBST(root)) {
	        System.out.print("Is BST"); 
	    }else{
	        System.out.print("Not a BST"); 
	    }

	}

}
