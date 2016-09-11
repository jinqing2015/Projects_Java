package cn.bh.Test2;

public class MyStackImpl<T> implements MyStack<T>{
	
	private Object[] stack = new Object[32];
	private int size = 0;
	private int addSize = 32;
	
	MyStackImpl(){
		
	}
	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public void clear() {
		for(int i=0; i<size; i++)
			stack[i]=null;
		size = 0;
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public T top() {
		if(size == 0)
			return null;
		return (T) stack[size-1];
	}

	@Override
	public boolean push(T temp) {
		if(size == stack.length)
			this.resize();
		stack[++size] = temp;
		return true;
	}

	@Override
	public T pop() {
		if(size == 0)
			return null;
		T ret = (T) stack[size-1];
		stack[--size] = null;
		return ret;
		
	}

	@Override
	public void resize() {
		Object[] temp = new Object[size + this.addSize];
		for(int i=0; i<size; i++){
			temp[i] = stack[i];
			stack[i] = null;//gc进行回收
		}
			
		this.stack = temp;
	}

}
