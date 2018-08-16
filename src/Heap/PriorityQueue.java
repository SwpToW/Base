package Heap;

import Structs.Queue;
/*
 * 基于堆实现的优先队列  优先队列：出队队列里面优先级最大的一个元素
 */
public class PriorityQueue<E extends Comparable<E>> implements Queue<E> {
    private MaxHeap<E> maxHeap;
    
    public PriorityQueue(){
    	maxHeap=new MaxHeap<>();
    }

	@Override
	public void enqueue(E e) {
		maxHeap.add(e);	
	}

	@Override
	public E dequeue() {
		return maxHeap.extrctMax();
	}

	@Override
	public E getFront() {
		return maxHeap.findMax();
	}

	@Override
	public int getSize() {
		return maxHeap.size();
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return maxHeap.isEmpty();
	}
}
