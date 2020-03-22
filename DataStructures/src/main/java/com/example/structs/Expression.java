package com.example.structs;

import java.util.Stack;

public class Expression {

	public boolean isBalanced(String input) {
		
		Stack<Character> stack = new Stack<>();
		
		for(char c: input.toCharArray()) {
			
			if(isLeftSide(c) ) 
				stack.push(c);
			
			if(isRightSide(c)) {
				char pop = stack.pop();
				
				// do a match
				if(
					 bracketsMatched(c, pop)
				 )
					return false;
					
			}
		}
		
		return stack.isEmpty();
	}

	private boolean bracketsMatched(char c, char pop) {
		return c == ')' && pop != '('  ||
		 c == '>' && pop != '<'  ||
		 c == ']' && pop != '['  ||
		 c == '}' && pop != '{';
	}

	private boolean isRightSide(char c) {
		return c == ')' || c == '>' || c == ']' || c == '}';
	}

	private boolean isLeftSide(char c) {
		return c == '(' || c == '<' || c == '[' || c == '{';
	}
}
