package BST;

public class FindMax {
	
	static BstNode findMax(BstNode root) {
		if(root == null) {
			return null;
		}
		
		while(root.right != null) {
			root =  root.right;
		}
		return root;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
