package DynamicProgramingTree;

public class MaxPathSum {
	
	static class Node{
		int data;
		
		Node left,right;
		
		Node(int data){
			this.data =  data;
			this.left =  null;
			this.right =  null;
		}
	}
	
	static class A {
		
		static int res =  Integer.MIN_VALUE;
	}
	
	
	static int solve(Node root , A a) {
		
		if(root == null) {
			return 0;
		}
		
		int left = solve(root.left, a);
		
		int right = solve(root.right , a);
		
		int temp = Math.max(Math.max(left, right)+root.data, root.data);
		
		a.res = Math.max(temp, left+right+root.data);
		
		return temp;
	}
	
	static int maxPath(Node root) {
		
		if(root == null) {
			return 0;
		}
		
		A a = new A();
		
		int maxPath =  solve(root, a);
		
		return a.res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node root = new Node(10); 
             root.left = new Node(2); 
             root.right = new Node(10); 
             root.left.left = new Node(20); 
             root.left.right = new Node(1); 
             root.right.right = new Node(-25); 
             root.right.right.left = new Node(3); 
             root.right.right.right = new Node(4);

             System.out.println(maxPath(root));
	}

}
