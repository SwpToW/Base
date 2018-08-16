package Heap;

import Structs.Array;

/*
 * 以动态数组为底层实现最大堆
 */
public class MaxHeap<E extends Comparable<E>> {
   private Array<E> data;
   public MaxHeap(int capacity){
	   data=new Array<>(capacity);
   }
   public MaxHeap(){
	   data=new Array<>();
   }
   
   //由一个数组构造成堆,这个操作记得看PPT
   public MaxHeap(E[] arr){
	   data=new Array<>(arr);
	   for(int i=parent(arr.length-1);i>=0;i--)
		   siftDown(i);
   }
   
   public int size(){
	   return data.getSize();
   }
   public boolean isEmpty(){
	   return data.isEmpty();
   }
   //返回完全二叉树的数组表示中，一个索引表示的元素的父节点的索引
   //有两种 ，一种以0表示根节点，一种以1表示根节点
   private int parent(int index){
	   if(index==0)
		   throw new IllegalArgumentException("no parent");
	   return (index-1)/2;
   }
   //返回左孩子索引
   private int leftChild(int index){
	   return index*2+1;
   }
   //返回右孩子索引
   private int rightChild(int index){
	   return index*2+2;
   }
   
   //向堆中添加元素
   public void add(E e){
	   data.addLast(e);//先添加到末尾，然后上浮操作
	   siftUp(data.getSize()-1);
   }
   //元素上浮
   private void siftUp(int k){
	   while(k>0&&data.get(parent(k)).compareTo(data.get(k))<0){
		   data.Swap(k,parent(k));
		   k=parent(k);//循环要变更
	   }
   }
   //看堆中最大元素
   public E findMax(){
	   if(data.getSize()==0)
		   throw new IllegalArgumentException("data =null");
	   return data.get(0);
   }
   //取出堆中最大元素
   public E extrctMax(){
	   E ret=findMax();
	   //删除最大元素
	   data.Swap(0, data.getSize()-1);
	   data.remove(data.getSize()-1);
	   siftDown(0);
	   return ret;
   }
   //元素下沉
   private void siftDown(int k){
	   //当传入的索引k的左孩子小于整个数组的大小时说明还没有到边界
	   while(leftChild(k)<data.getSize()){
           int j=leftChild(k);
           if(j+1<data.getSize()  //j+1是右孩子，当存在右孩子并且右孩子比左孩子大的时候，  要把右孩子赋值给j
        		   &&data.get(j+1).compareTo(data.get(j))>0)
        	             j=rightChild(k);//j=j+1
           //此时data[j]是 k的左孩子和右孩子中的最大值
           
           if(data.get(k).compareTo(data.get(j))>=0)// 如果当前节点比它的右孩子和左孩子中的更大值还要大或者等于，就不用交换
        	   break;
           data.Swap(k, j);  //否则就交换节点
           k=j;//这里很重要，循环的变化条件。
      }
   }
   //将传入的数组整理成堆
   

}
