package Structs;

public class LinkedList<E> {
   private class Node{//节点类
	   public E e;
	   public Node next;
	   public Node(E e,Node next){
		   this.e=e;
		   this.next=next;
	   }
	   public Node(E e){
		   this(e,null);
	   }
	   public Node(){
		   this(null,null);
	   }
	   @Override
	   public String toString(){
		   return e.toString();
	   }
   }
   private Node dummyhead; //虚拟头节点
   private int size;//节点个数
   
   public LinkedList(){
	   dummyhead=new Node(null,null); //虚拟头节点
	   size=0;
   }
   //获取个数
   public int getSize(){
	   return size;
   }
   //链表是否为空
   public boolean isEmpty(){
	   return size==0;
   }
   //链表中间添加新的节点
   public void add(int index,E e){
	   if(index<0||index>=size)
		   throw new IllegalArgumentException("wrong");
	   
		   Node prev=dummyhead;//从虚拟头节点开始遍历
		   for(int i=0;i<index;i++)
			   prev=prev.next;//循环结束后得到插入节点的前一个节点
		   Node node=new Node(e);//构造插入节点
		   node.next=prev.next;
		   prev.next=node;
		   //prev.next=new Node(e,prev.next);
		   size++;
	   
   }
   //链表头添加新的节点
   public void addFirst(E e){
	   add(0,e);
   }
   public void addLast(E e){
	   add(size,e);
   }
   public E get(int index){
	   if(index<0||index>=size)
		   throw new IllegalArgumentException("wrong");
	   Node cur=dummyhead.next;
	   for(int i=0;i<index;i++)//从0开始 寻找匹配的当前节点
		   cur=cur.next;
	   return cur.e;
   }
   public E getFirst(){
	   return get(0);
   }
   public E getLast(){
	   return get(size-1);
   }
   public void set(int index,E e){
	   if(index<0||index>=size)
		   throw new IllegalArgumentException("wrong");
	   Node cur=dummyhead.next;
	   for(int i=0;i>index;i++)
		   cur=cur.next;
	   cur.e=e;
   }
   public boolean contains(E e){
	   Node cur=dummyhead.next;
	   while(cur!=null){
		   if(cur.e.equals(e))
			   return true;
		    cur=cur.next;
	   }
	   return false;
   }
   public E remove(int index){
	   if(index<0||index>=size)
		   throw new IllegalArgumentException("wrong");
	   Node prev=dummyhead;
	   for(int i=0;i<index;i++)
		   prev=prev.next;
	   Node retNode=prev.next;
	   prev.next=retNode.next;
	   retNode.next=null;
	   size--;
	   return retNode.e;
   }
   public E removeFirst(){
	   return remove(0);
   }
   public E removeLast(){
	   return remove(size-1);
   }
   @Override
   public String toString(){
	   StringBuilder res=new StringBuilder();
	   Node cur=dummyhead.next;
	   while(cur!=null){
		   res.append(cur+"->");
		   cur=cur.next;
	   }
	   res.append("Null");
	   return res.toString();
   }
}
