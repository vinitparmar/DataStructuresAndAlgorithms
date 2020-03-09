package trees;

public class PostOrder {
	
	static TreeNode root;
	
	static void postOrder(TreeNode root) {
		if(root != null) {
			postOrder(root.left);
			postOrder(root.right);
			System.out.print(root.data);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
