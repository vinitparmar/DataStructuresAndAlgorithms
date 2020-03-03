package linkedlist;

public class DLLToBalancedBST {
	
	static DoubleNode head;
	
	static DoubleNode sortedDLLToBST() {
		
		int n = countNodes(head); 
		
		return sortedListToBst(n);
	}
	
	static  DoubleNode sortedListToBst(int num) {
		
		if(num <= 0) {
			return null;
		}
		
		DoubleNode left = sortedListToBst(num/2);
		
		DoubleNode root = new DoubleNode(head.data);
		
		root.prev = left;
		
		head = head.next;
		
		root.next = sortedListToBst(num-(num/2)-1);
		
		return root;
	}
	
	
	static int countNodes(DoubleNode node) {
		int count = 0;
		DoubleNode temp = node;
		while(temp!= null) {
			temp = temp.next;
			count++;
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
