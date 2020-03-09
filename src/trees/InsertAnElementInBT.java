package trees;

import java.util.LinkedList;
import java.util.Queue;

public class InsertAnElementInBT {

	static void addElemt(TreeNode root,int data) {
		
		Queue<TreeNode> q =  new LinkedList<TreeNode>();
		
		q.add(root);
		
		while(!q.isEmpty()) {
			
			TreeNode temp = q.poll();
			
			if(temp.left != null) {
				q.add(root.left);
			}else {
				temp.left = new TreeNode(data);
				break;
			}
			
			if(temp.right != null) {
				q.add(root.right);
			}else {
				temp.right = new TreeNode(data);
				break;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
