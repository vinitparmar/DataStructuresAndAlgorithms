package avltree;

public class AvlSingleRotate {

	static AvlTreeNode singleRotateRight(AvlTreeNode y) {
		
		AvlTreeNode x = y.left; 
		AvlTreeNode T2 = x.right;
		
		// Perform rotation 
        x.right = y; 
        y.left = T2;
        
        //update height
        y.height = Math.max(height(y.left), height(y.right)+1);
        x.height = Math.max(height(x.left), height(x.right)+1);
        
		return x;
	}
	
	static int height(AvlTreeNode node) {
		if(node ==  null) {
			return 0;
		}
		return node.height;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
