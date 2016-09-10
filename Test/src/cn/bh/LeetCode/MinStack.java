package cn.bh.LeetCode;

import java.util.Deque;
import java.util.LinkedList;

public class MinStack {
	private int min = Integer.MAX_VALUE;
	private Deque<Integer> minStack = null;
	/** initialize your data structure here. */
    public MinStack() {
        minStack = new LinkedList<>();
    }
    
    public void push(int x) {
    	if(x <= min){
    		minStack.push(min);//相当于如果当前要插入的数据是最小的，前一个数据是在他之前最小的
    		min = x;
    	}
        minStack.push(x);
    }
    
    public void pop() {
    	int x = minStack.pop();
    	if(min == x)
    	min = minStack.pop();
    }
    
    public int top() {
        return minStack.getFirst();
    }
    
    public int getMin() {
        return min;
    }

    public static void main(String[] args) {
    	MinStack obj = new MinStack();
    	obj.push(5);
    	obj.push(2);
    	obj.push(3);
    	obj.push(4);
    	obj.pop();
    	System.out.println(obj.top());
    	System.out.println(obj.getMin());
		
	}
}
