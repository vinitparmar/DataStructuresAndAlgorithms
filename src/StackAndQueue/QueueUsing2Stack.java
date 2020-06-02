package StackAndQueue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueUsing2Stack {
				
	static Queue<Integer> q1 =  new LinkedList<>();
	static Queue<Integer> q2 =  new LinkedList<>();
	
	static void push(int data) {
		 q1.add(data);	 
		 
	}
	
	static int pop() {
		
		while(!q1.isEmpty()) {
			
			if(q1.size() != 1) {
				q2.add(q1.poll());
			}else {
				break;
			}
			
		}
		
		int pop_Val = q1.poll();
		
		Queue<Integer> t = new LinkedList<>();
		t = q1;
		q1 = q2;
		q2 = t;
		
		return  pop_Val;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		push(1);
		push(3);
		push(6);
		
		
		System.out.println(pop());
	}

}
