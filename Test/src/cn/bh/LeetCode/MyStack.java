package cn.bh.LeetCode;

import java.util.LinkedList;
import java.util.Queue;

public class MyStack {
	
	private Queue<Integer> stack = null;
	
	public MyStack(){
		stack = new LinkedList<>();
	}
	
    // Push element x onto stack.
    public void push(int x) {
        stack.offer(x);
    }

    // Removes the element on top of the stack.
    public void pop() {
    	Queue<Integer> stackTemp = new LinkedList<>();
    	while(stack.size() > 1){
    		stackTemp.offer(stack.poll());
    	}
    	stack.remove();
    	stack = stackTemp;
    }

    // Get the top element.
    public int top() {
    	Queue<Integer> stackTemp = new LinkedList<>();

    	
    	while(stack.size() > 1){
    		stackTemp.offer(stack.poll());
    	}
    	int returnVal = stack.peek();
    	stackTemp.offer(stack.poll());
    	stack = stackTemp;
    	
    	return returnVal;
    }

    // Return whether the stack is empty.
    public boolean empty() {
        return stack.isEmpty();
    }
}
