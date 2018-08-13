package day19;

import java.util.ArrayList;
import java.util.List;

/*
 * List接口特点：  元素存储有序，带有索引，可以有重复元素 
 * 实现类有：ArrayList ,LinkedList
 * 
 * 
 * List接口中的抽象方法，有一部分和父接口collection是一样的
 * 关注List接口带有的独特方法（参数带索引index都是属于list的特有方法）
 */
public class ListInterfaceTest {
     public static void main(String[] args) {
		function2();
	}
     /*
      * void add(int index,E)把元素插入到列表的指定索引上
      * E remove(int index) 把指定索引的元素删除并将其返回
      * E set(index,E) 修改指定索引上的元素，返回修改之前的元素
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
