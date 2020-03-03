package linkedlist;

public class LoopInLinkedList {
	static SingleNode head; 
	//floyd algorithn
	
	static boolean  detectLoop (SingleNode head) {
		SingleNode slow = head;
		SingleNode fast = head;
		
		if(slow != null && fast != null && fast.next!= null) {
			slow =  slow.next;
			fast =  fast.next.next;
			
			if(slow == fast) {
			SingleNode startNodeOfLoop	= findStartOfLoop(fast);
			removeLoop(startNodeOfLoop);
				return true;
			}
		}
		return false;
	}
	
	// find stat of the loop
	static SingleNode findStartOfLoop(SingleNode fast){
		SingleNode slow = head;
		
		while(slow != fast) {
			slow = slow.next;
			fast = fast.next;
		}
		
		return fast;
	}
	// remove loop
	static void removeLoop(SingleNode startNodeOfLoop) {
			SingleNode slow ,fast;
			fast =  slow =  startNodeOfLoop;
			
			while(fast.next != slow) {
				fast =  fast.next;
			}
			fast.next = null;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
