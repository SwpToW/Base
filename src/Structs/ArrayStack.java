package Structs;
/*
 *   以动态封装的数组为底层实现，继承栈接口
 */
public class ArrayStack<E> implements Stack<E>{
     Array<E> array;// 基本结构
     public ArrayStack(int capacity){
    	 array=new Array<>(capacity);
  
     }
     public ArrayStack(){
    	 array=new Array<>();
     }
     @Override
     public int getSize(){
    	 return array.getSize();
     }
     @Override
     public boolean isEmpty(){
    	 return array.isEmpty();
     }
     public int getCapacity(){
    	 return array.getCapacity();
     }
     @Override
     public void push(E e){
    	 array.addLast(e);
     }
     @Override
     //从栈尾提取元素出栈
     public E pop(){
    	 return array.remove(array.getSize()-1);
     }
     @Override
     public E peek(){
    	 return array.getLast();
     }
     public String toString(){
    	 StringBuilder res=new StringBuilder();
    	 res.append("Stack: ");
    	 res.append('[');
    	 for(int i=0;i<array.getSize();i++){
    		 res.append(array.get(i));
    		 if(i!=array.getSize()-1)
    			 res.append(",");
    	 }
    	 res.append("] top");
    	 return res.toString();
     }
 }
