package Structs;
 /*
  * 循环队列  底层还是用数组实现的
  */
public class QueueBaseLoop<E> implements Queue<E> {
    private E[] data; 
    private int front,tail;  //头尾的指向
    private int size;
    public QueueBaseLoop(int capacity){
    	data=(E[])new Object[capacity+1];//有意识的浪费一个空间   因为tail==front说明数组为空， (tail+1)%data.length=front说明数组已满
    	front=0;
    	tail=0;
    	size=0;
    }
    public QueueBaseLoop(){
    	this(10);
    }
    public int getCapacity(){
    	return data.length-1;
    }
	@Override
	public void enqueue(E e) {
		// TODO Auto-generated method stub
	   	if((tail+1)%data.length==front)//队列已满
	   		resize(getCapacity()*2);
	   	data[tail]=e;
	   	tail=(tail+1)%data.length; //记得循环
}
	private void resize(int  newCapacity){
		E[] newData=(E[])new Object[newCapacity+1];
		for(int i=0;i<size;i++){
			newData[i]=data[(i+front)%data.length];//从i+front开始赋值size次
		}
		data=newData;
		front=0;
		tail=size;
	}
	@Override
	public E dequeue() {
		if(isEmpty())
			throw new IllegalArgumentException("worng");
	     E ret=data[front];
	     data[front]=null;
	     front=(front+1)%data.length;
	     size--;
	     if(size==getCapacity()/4&&getCapacity()!=0)
	    	 resize(getCapacity()/2);
		 return ret;
	}
	@Override
	public E getFront() {
		if(isEmpty())
			throw new IllegalArgumentException("worng");
		return data[front];
	}
	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return size;
	}
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return front==tail;
	}
	@Override
	public String toString(){
		StringBuilder res=new StringBuilder();
    	res.append(String.format("Queue:size=%d,capacity=%d\n", size,getCapacity()));
    	res.append("front [");
    	for(int i=front;i!=tail;i=(i+1)%data.length){
    		res.append(data[i]);
    		if((i+1)%data.length!=tail)
    			res.append(",");
    	}
    	res.append("] tail");
    	return res.toString();
	}
    
}
