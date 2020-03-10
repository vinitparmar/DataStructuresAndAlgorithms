package BST;

public class FindMinNode {
	static BstNode root;
	
	static BstNode findMinNode(BstNode root) {
		if(root == null) {
			return null;
		}
		while(root.left != null) {
			root = root.left;
		}
		return root;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
