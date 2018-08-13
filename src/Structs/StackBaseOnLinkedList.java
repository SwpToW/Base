package Structs;
/*
 * 基于 链表实现的栈
 */
public class StackBaseOnLinkedList<E> implements Stack<E> {
	private LinkedList<E> list;
	
	public StackBaseOnLinkedList(){
		list=new LinkedList<>();
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return list.getSize();
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return list.isEmpty();
	}

	@Override
	public void push(E e) {
		list.addFirst(e);
		
	}

	@Override
	public E pop() {
		// TODO Auto-generated method stub
		return list.removeFirst();
	}

	@Override
	public E peek() {
		// TODO Auto-generated method stub
		return list.getFirst();
	}
	@Override
	public String toString(){
		StringBuilder res=new StringBuilder();
		res.append("Stack:top");
		res.append(list);
		return res.toString();
	}
	

}
