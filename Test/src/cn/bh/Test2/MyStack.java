package cn.bh.Test2;

public interface MyStack<T> {
	//�ж�ջ�Ƿ�Ϊ��
	boolean isEmpty();
	//���ջ�ڵ���������
	void clear();
	//����ջ�Ĵ�С
	int size();
	//����ջ�����ϲ�Ԫ��
	T top();
	//��ջ����
	boolean push(T temp);
	//��ջ����
	T pop();
	//���ݲ���
	void resize();
}
