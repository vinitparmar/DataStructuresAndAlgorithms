package trees;

public class HeightOfBt {

	static int depthOfBt(TreeNode root) {
		if(root == null) {
			return 0;
		}
		int leftDepth = depthOfBt(root.left);
		int rightDepth =  depthOfBt(root.right);
		
		return (leftDepth > rightDepth) ? leftDepth +1 : rightDepth + 1;	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
