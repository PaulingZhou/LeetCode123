package com.zhou.solution155;

import java.util.Stack;

public class MinStack {
	private int min;
	private Stack<Element> stack;
	private class Element{
		int val;
		int min;
		public Element(int val, int min) {
			this.val = val;
			this.min = min;
		}
	}
	
	public MinStack(){
		stack = new Stack<Element>();
	}
	
	public void push(int x){
		min = stack.isEmpty() ? x : Math.min(stack.peek().min,x);
		stack.push(new Element(x, min));
	}
	
	public void pop(){
		if(stack.isEmpty())return;
		stack.pop();
	}
	
	public int top(){
		return stack.peek().val;
	}
	
	public int getMin(){
		return stack.peek().min;
	}
}
