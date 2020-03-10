package trees;

public class DiameterOfTree {
	
	static int diameterOfTree(TreeNode root) {
		
		if(root == null) {
			return 0;
		}
		
		int left = diameterOfTree(root.left);
		
		int right = diameterOfTree(root.right);
		
		return Math.max(left, right)+1;
	}
	
	static int height(TreeNode root) {
		if(root == null) {
			return 0;
		}
		int lHt = height(root.left);
		int rHt = height(root.right);
		return Math.max(lHt,rHt)+1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
