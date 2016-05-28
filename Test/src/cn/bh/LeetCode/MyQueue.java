package cn.bh.LeetCode;

import java.util.Deque;
import java.util.LinkedList;

public class MyQueue {
	
	private Deque<Integer> stack = null;
	
	public MyQueue(){
		stack = new LinkedList<>();
	}
	
	// Push element x to the back of queue.
    public void push(int x) {
        stack.push(x);
    }

    // Removes the element from in front of queue.
    public void pop() {
        Deque<Integer> stackTemp = new LinkedList<>();
        while(!stack.isEmpty()){
        	stackTemp.push(stack.pop());
        }
        stackTemp.pop();
        
        while(!stackTemp.isEmpty()){
        	stack.push(stackTemp.pop());
        }
    }

    // Get the front element.
    public int peek() {
    	Deque<Integer> stackTemp = new LinkedList<>();
        while(!stack.isEmpty()){
        	stackTemp.push(stack.pop());
        }
        int ret = stackTemp.pop();
        stackTemp.push(ret);
        
        while(!stackTemp.isEmpty()){
        	stack.push(stackTemp.pop());
        }
        return ret;
    }

    // Return whether the queue is empty.
    public boolean empty() {
        return stack.isEmpty();
    }
}
