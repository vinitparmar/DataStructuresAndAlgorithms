package StackAndQueue;

import java.util.Stack;

public class ParenthesisChecker {
	
	public static boolean isBalanced(String str) {
		
		Stack s =  new Stack();
		
		for (char c : str.toCharArray() ) {
			
				if(s.isEmpty()) {
					
					s.push(c);
				}else {
					
					if(s.peek().equals('{') && c == '}' || s.peek().equals('}') && c == '{' || s.peek().equals('(') && c == ')' || s.peek().equals(')') && c == '(' || 
							s.peek().equals('[') && c == ']' || s.peek().equals(']') && c == '[') {
						s.pop();
					}else {
						s.push(c);
					}
				}
			
		}
		
		if(s.isEmpty()) {
			return true;
		}
		
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "({][})";
		
		System.out.println(isBalanced(str));

	}

}
