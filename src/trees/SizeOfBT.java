package trees;

public class SizeOfBT {
	
	static int size(TreeNode root) {
		
		int leftCount = root.left == null ? 0 : size(root.left);
		int rightCount = root.right == null ? 0 : size(root.right);
		return 1+rightCount+leftCount;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
