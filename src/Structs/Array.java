package Structs;
/*
 * 封装自己的数组-动态数组
 * capacity 容量
 * size 实际元素个数
 */
public class Array<E> {
    private E[] data;
    private int size;
    //构造函数，闯入容量构造Array
    public Array(int capacity){
    	data =(E[])new Object[capacity];
    	size=0;
    }
    //无参构造默认容量为10
    public Array(){
    	data =(E[])new Object[10];
    }
    public Array(E[] arr){
    	data=(E[])new Object[arr.length];
    	for(int i=0;i<arr.length;i++)
    		data[i]=arr[i];
    	size=arr.length;
    		
    }
    //获取元素个数
    public int getSize(){
    	return size;
    }
    //获取数组容量
    public int getCapacity(){
    	return data.length;
    }
    //返回数组是否为空
    public boolean isEmpty(){
    	return size==0;
    }
    //添加元素
    public void addLast(E e){
    	add(size,e);
    }
    //在元素前添加新元素
    public void addFirst(E e){
    	add(0,e);
    }
    //向指定位置添加元素
    public void add(int index,E e){
    	
    	if(index<0||index>size)
    		throw new IllegalArgumentException("wrong");
    	if(size==data.length)
    	   resize(2*data.length);
    	for(int i=size-1;i>=index;i--)
    		data[i+1]=data[i];
    	data[index]=e;
    	size++;
    }
    //
    @Override
    public String toString(){
    	StringBuilder res=new StringBuilder();
    	res.append(String.format("Array:size=%d,capacity=%d\n", size,data.length));
    	res.append('[');
    	for(int i=0;i<size;i++){
    		res.append(data[i]);
    		if(i!=size-1)
    			res.append(",");
    	}
    	res.append(']');
    	return res.toString();
    }
    //获取index处的元素
    public  E get(int index){
    	if(index<0 || index>=size)
    		throw new IllegalArgumentException("wrong");
    	return data[index];
    	
    }
    public E getLast(){
    	return get(size-1);
    }
    public E getFirst(){
    	return get(0);
    }
    void set(int index,E e){
    	if(index<0 || index>=size)
    		throw new IllegalArgumentException("wrong");
    	data[index]=e;
    }
    //判断元素是否存在
    public boolean contains(E e){
    	for(int i=0;i<size;i++){
    		if(data[i].equals(e))
    			return true;
    	}
    	return false;
    }
    
    //删除指定位置元素并返回
    public E remove(int index){
    	if(index<0||index>=size)
    		throw new IllegalArgumentException("wrong");
    	E ret=data[index];
    	for(int i=index+1;i<size;i++)
    		data[i-1]=data[i];
    	size--;
    	
    	if(size==data.length/4&&data.length/2!=0);// 如果阈值设置到容器的1/2, 
    	    //在最坏的情况下会发生复杂度震荡，影响性能
    	   resize(data.length/2); //缩容
    	return ret;
    }
    //交换
    public void Swap(int i,int j){
    	if(i<0 || i >=size || j< 0 || j>=size)
    		throw new IllegalArgumentException("index is illegl");
    	E e=data[i];
    	data[i]=data[j];
    	data[j]=e;
    }
    //扩容机制
    private void resize(int newCapacity){
    	E[] newData=(E[])new Object[newCapacity];
    	for(int i=0;i<size;i++)
    		newData[i]=data[i];
    	data=newData;
    }
}
