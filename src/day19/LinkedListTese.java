package day19;

import java.util.LinkedList;

/* 链表
 * LinkedList:List接口的单向链表实现
 * 线程不同步
 * 提供了大量的首尾操作方法，查询慢，增删快
 * 自身特点：链表的底层实现
 * LinkedList特有方法：
 * 
 */
public class LinkedListTese {
   public static void main(String[] args) {
	function2();
}  
   /*
    * E removeFirst() 移除开头并返回开头
    * E removeLast() 移除尾巴并返回
    */
   public static void function2(){
	   LinkedList<String> link=new LinkedList<String>();
	   link.add("a");
	   link.add("b");
	   link.add("c");
	   link.add("d");
	   System.out.println(link.removeFirst());
	   System.out.println(link);
   }
   /*
      E getFirst()  获取开头	
      E getLast()    获取结尾
    */
   public static void function1(){
	   LinkedList<String> link=new LinkedList<String>();
	   link.add("a");
	   link.add("b");
	   link.add("c");
	   link.add("d");
	   String begin=link.getFirst();
	   String end=link.getLast();
	   System.out.println(link);
   }
   /*
    * void addFirst(E )  添加到链表开头
    * void addLast(E )  添加到链表结尾
    */
   public static void function(){
	   LinkedList<String> link=new LinkedList<String>();
	   link.add("abc");
	   link.add("bcd");
	   link.addFirst("itcast");
	   System.out.println(link);
   }
}
