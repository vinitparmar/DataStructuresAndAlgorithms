package linkedlist;

import java.util.LinkedHashSet;

public class IntersectionOf2LinkedList {
	
	static SingleNode intersection(SingleNode head1, SingleNode head2) {
		
		LinkedHashSet<SingleNode> hs = new LinkedHashSet<>();
		 while(head1 != null) {
			 hs.add(head1);
			 head1= head1.next;
		 }
		 
		 while(head2 != null) {
			 if(hs.contains(head2)) {
				 return head2;
			 }
			 head2 = head2.next;
		 }
		return null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
