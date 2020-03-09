package trees;

public class InOrder {
	
	static TreeNode root;
	
	static void inOrder(TreeNode root) {
		if(root != null) {
			inOrder(root.left);
			System.out.print(root.data);
			inOrder(root.right);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
