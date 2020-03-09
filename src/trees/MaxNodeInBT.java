package trees;

import java.util.LinkedList;
import java.util.Queue;

public class MaxNodeInBT {
	
	 static int maxNode = 0;
	 
	 static int maxNode(TreeNode root) {
		 Queue<TreeNode> q = new LinkedList<>();
		 q.add(root);
		 while(!q.isEmpty()) {
			 TreeNode temp = q.poll();
			 if (temp.left != null) {
				maxNode(temp.left);
			  }
			 if (temp.right != null) {
					maxNode(temp.right);
				}
			 if(maxNode >temp.data) {
				 maxNode = temp.data;
			 }
		 }
		 
		 return maxNode;
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
