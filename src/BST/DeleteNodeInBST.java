package BST;

public class DeleteNodeInBST {
	static BstNode tree = null;
	static BstNode deleteNode(BstNode root,int data) {
		
		BstNode temp;
		if(root == null) {
			//System.out.println("element not there");
			return null;
		}else if(data < root.data) {
			// check the left node
			root.left = deleteNode(root.left, data);
		}else if(data > root.data) {
			// check the right node
			root.right = deleteNode(root.right, data);
		}else {
			// if node is found 
			if(root.left != null && root.right != null) {
				temp = root;
				//find the minimum node from right
				BstNode minNodFromRight  =  minRightNode(temp.right);
				// replace curr node with min node from right subtree
				root.data =  minNodFromRight.data;
				//delete min node from the right
				root.right = deleteNode(root.right, minNodFromRight.data);
			}else if(root.left ==  null) {
					root = root.right;
				} else if(root.right ==  null) {
					root = root.left;
				}else{
					
					root = null;
				}
			}
		
		return root;
	}
	
	static BstNode minRightNode(BstNode node) {
		if(node.left  == null) {
			return node;
		
		 }else{
		
			return minRightNode(node.left);
		
		}
		
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
		   deleteNode(tree, 50);
		   inOrderTreverssal(tree);
		   
		
	}

}
