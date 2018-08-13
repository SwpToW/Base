package Structs;
/*
 * 栈接口，规定了栈需要实现的方法
 */
public interface Stack<E> {
	int getSize();
	boolean isEmpty();
	void push(E e);
	E pop();
	E peek();

}
