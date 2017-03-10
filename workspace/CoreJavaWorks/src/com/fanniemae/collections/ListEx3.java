package com.fanniemae.collections;

import java.util.Stack;

public class ListEx3 {
	
	public static void main(String args[]){
		Stack<String> stack = new Stack<String>();
		stack.push("tofu");
		stack.push("Siva");
		
		stack.push("chiti");
		
		System.out.println(stack);
		
		stack.pop();
		
		System.out.println(stack);
		
		System.out.println(stack.peek());
	}

}
