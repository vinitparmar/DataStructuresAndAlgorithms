package BST;

public class InsertNodeInBST {
	static BstNode tree = null; 
	
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
		return root ;
	}
	
	 static void inOrderTreverssal(BstNode tree) {
		 
		 if (tree == null)return;
				
		 inOrderTreverssal(tree.left);
		 System.out.print(tree.data+" ");
		 inOrderTreverssal(tree.right);
		 
		 
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		       tree =  new BstNode(50);
			   tree.left = new BstNode(30);
			   tree.left.left = new BstNode(20);
			   tree.left.right = new BstNode(40);
			   tree.right = new BstNode(70);
			   tree.right.left = new BstNode(60);
			   
			   inOrderTreverssal(tree);
			   System.out.println();
			   //System.out.println(insert(tree, 80));
			   insert(tree, 55);
			   inOrderTreverssal(tree);
			   
		       
			        
	}
	

}
