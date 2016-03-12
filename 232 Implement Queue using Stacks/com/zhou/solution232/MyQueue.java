package com.zhou.solution232;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class MyQueue {
	Stack<Integer> s = new Stack<Integer>(); 
	List<Integer> objList = new ArrayList<Integer>();
	
    // Push element x to the back of queue.
    public void push(int x) {
    	while(!s.isEmpty()) objList.add(0,s.pop());
    	objList.add(0, x);
    	while(!objList.isEmpty())s.push(objList.remove(0));
    }

    // Removes the element from in front of queue.
    public void pop() {
    	s.pop();
    }

    // Get the front element.
    public int peek() {
        return s.peek();
    }

    // Return whether the queue is empty.
    public boolean empty() {
        return s.isEmpty();
    }
}
