package day19;

import java.util.LinkedList;

/* ����
 * LinkedList:List�ӿڵĵ�������ʵ��
 * �̲߳�ͬ��
 * �ṩ�˴�������β������������ѯ������ɾ��
 * �����ص㣺����ĵײ�ʵ��
 * LinkedList���з�����
 * 
 */
public class LinkedListTese {
   public static void main(String[] args) {
	function2();
}  
   /*
    * E removeFirst() �Ƴ���ͷ�����ؿ�ͷ
    * E removeLast() �Ƴ�β�Ͳ�����
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
      E getFirst()  ��ȡ��ͷ	
      E getLast()    ��ȡ��β
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
    * void addFirst(E )  ��ӵ�����ͷ
    * void addLast(E )  ��ӵ������β
    */
   public static void function(){
	   LinkedList<String> link=new LinkedList<String>();
	   link.add("abc");
	   link.add("bcd");
	   link.addFirst("itcast");
	   System.out.println(link);
   }
}
