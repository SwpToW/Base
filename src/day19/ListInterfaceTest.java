package day19;

import java.util.ArrayList;
import java.util.List;

/*
 * List�ӿ��ص㣺  Ԫ�ش洢���򣬴����������������ظ�Ԫ�� 
 * ʵ�����У�ArrayList ,LinkedList
 * 
 * 
 * List�ӿ��еĳ��󷽷�����һ���ֺ͸��ӿ�collection��һ����
 * ��עList�ӿڴ��еĶ��ط���������������index��������list�����з�����
 */
public class ListInterfaceTest {
     public static void main(String[] args) {
		function2();
	}
     /*
      * void add(int index,E)��Ԫ�ز��뵽�б��ָ��������
      * E remove(int index) ��ָ��������Ԫ��ɾ�������䷵��
      * E set(index,E) �޸�ָ�������ϵ�Ԫ�أ������޸�֮ǰ��Ԫ��
      */
     public static void function(){
    	 List<String> l=new ArrayList<String>();
    	 l.add("1");
    	 l.add("2");
    	 l.add("3");
    	 l.add(1, "sb");
    	 System.out.println(l);
     }
     public static void function1(){
    	 List<String> l=new ArrayList<String>();
    	 l.add("1");
    	 l.add("2");
    	 l.add("3");
    	 System.out.println(l.remove(0));
    	 System.out.println(l);
     }
     public static void function2(){
    	 List<Integer> l=new ArrayList<Integer>();
    	 l.add(1);
    	 l.add(2);
    	 l.add(3);
    	 System.out.println(l.set(0, 4));
    	 System.out.println(l);
    	 
     }
}
