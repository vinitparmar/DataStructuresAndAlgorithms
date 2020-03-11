package avltree;

public class AvlTreeNode {
	
	public int data, height;
	public AvlTreeNode left, right;
	
	public AvlTreeNode(int data) {
		this.data =  data;
		height = 1;
	}

}
