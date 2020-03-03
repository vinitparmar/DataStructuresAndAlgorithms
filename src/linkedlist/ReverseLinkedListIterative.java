package linkedlist;

public class ReverseLinkedListIterative {
	
	static SingleNode Head;
	
	static void  reverseLinkedList(SingleNode head) {
		SingleNode curr = head;
		SingleNode prev = null;
		SingleNode next = null;
		
		
		if(head == null) {
			return;
		}else{
			while(curr!=null) {
			next =  curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
			}
			head =  prev;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
