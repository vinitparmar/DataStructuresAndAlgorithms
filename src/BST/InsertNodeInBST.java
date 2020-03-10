package BST;

public class InsertNodeInBST {

	static BstNode insert(BstNode root , int data) {
		if(root == null) {
			root = new BstNode(data);
			return root;
		}else {
			if(data < root.data) {
				root.left = insert(root.left, data);	
			} else if(data > root.data) {
				root.right = insert(root.right,data);
			}	
		}
		return root;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
