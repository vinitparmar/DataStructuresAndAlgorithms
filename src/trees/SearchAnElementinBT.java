package trees;

import java.util.LinkedList;
import java.util.Queue;

public class SearchAnElementinBT {
	
	static boolean searchElement(TreeNode root, int n) {
		
		Queue<TreeNode> q =  new LinkedList<TreeNode>();
		q.add(root);
		
		while(!q.isEmpty()) {
			
			TreeNode temp =  q.poll();
			
			if(temp.left != null) {
				q.add(temp.left);
			}
			if(temp.right != null) {
				q.add(temp.right);
			}
			
			if(temp.data == n) {
				return true;
			}
			
		}
		
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
