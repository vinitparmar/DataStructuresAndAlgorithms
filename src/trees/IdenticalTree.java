package trees;

public class IdenticalTree {

	static boolean isIdentical(TreeNode root1,TreeNode root2) {
		
		if(root1==null && root2==null) {
			return true;
		}
		
		if(root1==null || root2==null) {
			return false;
		}
		 return (isIdentical(root1.left, root2.right) && isIdentical(root1.right, root2.left));
		 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
