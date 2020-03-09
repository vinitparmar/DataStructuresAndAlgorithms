package trees;

import java.util.LinkedList;
import java.util.Queue;

public class LeafNodesinBT {
	
	static TreeNode root;
	static int count = 0;
	static int countLeafNodes(TreeNode root) {
		if(root == null) {
			return 0;
		}
		
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		q.add(root);
		
		while(!q.isEmpty()) {
			TreeNode temp =  q.poll();
			if(temp.left == null && temp.right == null) {
				count++;
			}
			
			if(temp.left != null) {
				q.add(temp.left);
			}
			
			if(temp.right != null) {
				q.add(temp.right);
			}
		}
		
		
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
