package trees;

public class MinHeightOfTree {
	
	static int minHeight(TreeNode root) {
		
		if(root == null) {
			return 0;
		}
		
		int left = minHeight(root.left);
		int right = minHeight(root.right);
		
		 return (left == 0 || right == 0) ? left + right + 1: Math.min(left,right) + 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeNode root = new TreeNode(4);
		root.left = new TreeNode(7);
		//root.right = new TreeNode(9);
		root.left.left = new TreeNode(71);
		System.out.println(minHeight(root));
	}

}
