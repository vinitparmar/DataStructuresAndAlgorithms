package trees;

public class PreOrder {
	
	static TreeNode root;
	
	static void preOrder(TreeNode root) {
		
		if(root != null) {
			System.out.println(root.data);
			preOrder(root.left);
			preOrder(root.right);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
