package com.example.structs;

import java.util.Stack;

public class StackDemo {

	public void simpleExample() {

		Stack<Integer> stack = new Stack<>();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		System.out.println(stack);
		Integer val = stack.pop();
		System.out.println(val);
		System.out.println(stack);
		val = stack.peek();
		System.out.println(val);
		System.out.println(stack);	
	}
	
	public String stringReversal(String input) {
		
		Stack<Character> stackOfChars = new Stack<>();
		char[] chars = input.toCharArray();
		for(char c:chars){
			stackOfChars.push(c);
		}
		
		System.out.println(stackOfChars);
		System.out.println(stackOfChars.size());
		
		StringBuffer buffer = new StringBuffer();
		while(!stackOfChars.empty()) {
			buffer.append(stackOfChars.pop());
		}
		
		return buffer.toString();
	}

	public void balanceTest(String input) {
		
		Expression expr = new Expression();
		System.out.println(input + " --> " + expr.isBalanced(input));
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackDemo demo = new StackDemo();
		demo.simpleExample();
		
		System.out.println(demo.stringReversal("my name is this"));
		
		demo.balanceTest("(this is a good test)");
		demo.balanceTest("(this is a off test]");
		demo.balanceTest("((this is a good test))");
		demo.balanceTest("[(this is a good test)}");
		
	}

}
