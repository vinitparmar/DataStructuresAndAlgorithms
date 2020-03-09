package trees;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {
	
	static TreeNode root;
	
	static void levelOrderTraversal(TreeNode root) {
		Queue<TreeNode> q = new LinkedList<>();
		
		q.add(root);
		
		while(!q.isEmpty()) {
			TreeNode temp =  q.poll();
			
			if(temp.left != null) {
				q.add(temp.left);
			}
			
			if(temp.right != null) {
				q.add(temp.right);
			}
			
			System.out.print(temp.data+" ");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
