package StackAndQueue;

import java.util.Stack;

public class MinElementInStack {
	
	static Stack<Integer> s =  new Stack<>();
	
	static int min = Integer.MAX_VALUE;
	
	static void  add(int data) {
		
		min = Math.min(min, data);
		s.push(data);
		
	}
	
	static int min() {
		return min;
	}
			

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		add(11);
		add(9);
		add(14);
		
		System.out.println(min());

	}

}
