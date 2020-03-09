package trees;

public class CousinNode {
	
	static TreeNode root;
	
	static boolean isCousin(TreeNode root,TreeNode a, TreeNode b) {
		
		/*
		 * 1.nodes should be at same level.
		 * 2.they should not have same parent.
		*/
		
		return ((level(root,a,1) == level(root,b,1)) && (!isSibling(root,a,b)));
	}
	
	static int level(TreeNode root,TreeNode ptr,int lev) {
		
		if(root == null){
			return 0;
		}
		
		if(root == ptr) {
			return lev;
		}
		
		int l = level(root.left,ptr,lev+1);
		 if(l !=0) {
			 return l;
		 }
		return level(root.right,ptr,lev+1);
		
	}
	
	static boolean isSibling(TreeNode root,TreeNode a,TreeNode b) {
		
		if(root == null) {
			return false;
		}
		
			
		return ((root.left == a && root.right==b) ||
				(root.right == b && root.left == a) ||
				isSibling(root.left, a, b) ||
				isSibling(root.right, a, b));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
