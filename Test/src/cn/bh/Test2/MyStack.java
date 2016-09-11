package cn.bh.Test2;

public interface MyStack<T> {
	//判断栈是否为空
	boolean isEmpty();
	//清空栈内的所有内容
	void clear();
	//返回栈的大小
	int size();
	//返回栈的最上层元素
	T top();
	//进栈操作
	boolean push(T temp);
	//出栈操作
	T pop();
	//扩容操作
	void resize();
}
