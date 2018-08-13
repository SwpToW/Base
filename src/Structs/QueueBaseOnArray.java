package Structs;
/*
 * 基于数组的队列实现
 */
public class QueueBaseOnArray<E> implements Queue<E> {
    Array<E> array;
	
	public QueueBaseOnArray(int capacity){
		array=new Array<>(capacity);
	}
	 public QueueBaseOnArray() {
		array=new Array<>();
	}
	@Override
	public void enqueue(E e) {
		array.addLast(e);
	}

	@Override
	public E dequeue() {
		return array.remove(0);
	}

	@Override
	public E getFront() {
		// TODO Auto-generated method stub
		return array.getFirst();
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return array.getSize();
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return array.isEmpty();
	}
    public String toString(){
   	 StringBuilder res=new StringBuilder();
   	 res.append("Queue: ");
   	 res.append("front :[");
   	 for(int i=0;i<array.getSize();i++){
   		 res.append(array.get(i));
   		 if(i!=array.getSize()-1)
   			 res.append(",");
   	 }
   	 res.append("] tail");
   	 return res.toString();
    }
     
}
