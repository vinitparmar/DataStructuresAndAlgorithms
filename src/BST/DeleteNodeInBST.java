package BST;

public class DeleteNodeInBST {
	
	static BstNode deleteNode(BstNode root,int data) {
		
		BstNode temp;
		if(root == null) {
			System.out.println("element not there");
		}else if(data < root.data) {
			root.left = deleteNode(root.left, data);
		}else if(data > root.data) {
			root.right = deleteNode(root.right, data);
		}else {
			if(root.left != null && root.right != null) {
				temp = root.left;
				root.data =  temp.data;
				root.left = deleteNode(root.left, data);
			}else{
				temp = root;
				if(root.left ==  null) {
					root = root.right;
				}
				if(root.right ==  null) {
					root = root.left;
				}
			}
		}
		
		return root;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
