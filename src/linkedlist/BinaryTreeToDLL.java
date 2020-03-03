package linkedlist;

import java.util.LinkedList;
import java.util.Queue;
import java.util.function.DoubleBinaryOperator;

public class BinaryTreeToDLL {
	
	static DoubleNode head;
	
	static void binaryToDll(DoubleNode root) {
		
		if(root == null) {
			return;
		}
		
		Queue<DoubleNode> q = new LinkedList<>();
		q.add(root);
		//head =  root;
		
		while(!q.isEmpty()){
			
			DoubleNode temp = q.poll();
			
			if (temp.next != null) {
				q.add(temp.next);
			}
			
			if(temp.prev != null) {
				q.add(temp.prev);
			}
			push(temp);
		}
	}
	
	static void push(DoubleNode node) {
		DoubleNode temp = node;
		DoubleNode curr = null;
		if(head == null) {
			head = temp;
			curr = head;
		}else{
			curr.next =  temp;
			temp.prev = curr;
			curr = temp;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
