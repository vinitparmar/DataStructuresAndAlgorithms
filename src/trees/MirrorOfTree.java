package trees;

public class MirrorOfTree {
	
	static void createMirror(TreeNode root) {
		
		 TreeNode temp;
		 if(root != null) {
			 createMirror(root.left);
			 createMirror(root.right);
			 //swap
			 temp = root.left;
			 root.left = root.right;
			 root.right = temp;
		 }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
