package linkedlist;

public class Merge2SortedList {
	
	static SingleNode head;
	
	public SingleNode merge(SingleNode head1,SingleNode head2) {
		/*if(head1 == null) {
			return head2;
		}
		
		if(head2 == null) {
			return head1;
		}
		
		if(head1.data < head2.data) {
			head1.next = merge(head1.next, head2);
			return head1;
		}else {
			head2.next = merge(head1, head2.next);
			return head2;
		}	*/
		
		if(head != null && head2 != null && head == null) {
			if(head1.data < head2.data) {
				head = head1;
				head1.next =  merge(head1.next, head2);
			}else {
				head =  head2;
				head2.next = merge(head1, head2.next);
			}
		}else {
			if(head1.data<head2.data) {
				head1.next = merge(head1.next, head2);
				return head1;
			}else {
				head2.next =  merge(head1, head2.next);
				return head2;
			}
			
		}
		return head;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
