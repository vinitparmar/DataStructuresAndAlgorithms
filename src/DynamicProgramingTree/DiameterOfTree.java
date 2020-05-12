package DynamicProgramingTree;

public class DiameterOfTree {
	
	static Node root = null;
	
	
	static class Node{
		int data;
		
		Node left  , right;
		
		Node(int data){
			this.data = data;
			left =  null;
			right = null;
		}
	}
	
	static class A {
		
	    int res  = Integer.MIN_VALUE;
		
	}
	
	static int solve(Node root, A a) {
		//base condition 
		if(root ==  null) {
			return 0;
		}
		
		//hypothesis
		
		int left_SubTree_len = solve(root.left,a);
		
		int right_SubTree_len = solve(root.right,a);
		
		//induction
		
		int temp = Math.max(left_SubTree_len,right_SubTree_len)+1;
		
		 a.res = Math.max(temp, 1+left_SubTree_len+right_SubTree_len);
		
		return temp;
		
	}
	
	// computes the diameter
	
	static int diameter(Node root) {
		
		if(root == null) {
			return 0;
		}
		int res  = Integer.MIN_VALUE;
		
		// answer will be here
		
		A a = new A();
		
		int height = solve(root,a);
		
		return a.res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		    root = new Node(1);  
		    root.left = new Node(2);  
		    root.right = new Node(3);  
		    root.left.left = new Node(4);  
		    root.left.right = new Node(5); 
		    System.out.println(diameter(root));

	}

}
