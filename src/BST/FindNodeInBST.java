package BST;

public class FindNodeInBST {
	
	static BstNode findElement(BstNode root,int data) {
		if(root ==  null) {
			return null;
		}
		
		if(data < root.data) {
			return findElement(root.left, data);
		}
		else if(data > root.data) {
			return findElement(root.right, data);
		}
		
		return root;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
