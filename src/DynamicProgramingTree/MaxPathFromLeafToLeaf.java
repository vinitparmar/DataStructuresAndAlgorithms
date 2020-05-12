package DynamicProgramingTree;

public class MaxPathFromLeafToLeaf {
	
	static Node root ;
	
	static class Node {
		int data;
		Node left , right;
		
		Node(int data){
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}
	
	static class A {
		
		static int res = Integer.MIN_VALUE;
		
	}
	
	static int solve(Node root, A a) {
		
		if(root == null) {
			return 0;
		}
		
		int left =  solve(root.left,a);
		
		int right =  solve(root.right,a);
		
		int temp = Math.max(left,right)+root.data;
		
		if(root.left == null && root.right == null) {
			
			temp = Math.max(temp, root.data);
		}
		
		int ans = Math.max(temp, left+right+root.data);
		
		a.res = Math.max(ans, a.res);
		
		return temp;
		
	}
	
	static int maxPath(Node root) {
		
		if(root == null) {
			
			return 0;
		}
		
		A a = new A();
		
		solve(root, a);
		
		return a.res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    root = new Node(-15); 
	        root.left = new Node(5); 
	        root.right = new Node(6); 
	        root.left.left = new Node(-8); 
	        root.left.right = new Node(1); 
	        root.left.left.left = new Node(2); 
	        root.left.left.right = new Node(6); 
	        root.right.left = new Node(3); 
	        root.right.right = new Node(9); 
	        root.right.right.right = new Node(0); 
	        root.right.right.right.left = new Node(4); 
	        root.right.right.right.right = new Node(-1); 
	        root.right.right.right.right.left = new Node(10);
	        
	        System.out.println(maxPath(root));
	}

}
