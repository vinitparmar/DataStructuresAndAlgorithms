package linkedlist;

public class ReverseLinkedListRecursive {
	
	static SingleNode head;
	
	static void reverse(SingleNode curr , SingleNode prev) {
		if(curr.next == null) {
			head =  curr;
			curr.next = prev;
		}
		
		SingleNode next = curr.next;
				   curr.next = prev;
				   reverse(next, curr);
				   head =  curr;
				   
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
