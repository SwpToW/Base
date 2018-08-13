package day19;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 * 哈希表：继承了Set接口的类，不允许有重复元素，没有索引。是一个无序集合
 * HashSet：存储和取出都比较快，线程不安全，也就意味着快。
 * 代码的编写和ArrayList完全一致
 * 数据结构哈希表：链表数组结合体
 * 对象的哈希值:普通的十进制整数
 * Object 有public int hashCode()方法  计算结果int整数
 */
public class HashSetTest {
   public static void main(String[] args) {
	   HashSet<String> s=new HashSet<String>();
	   s.add("cn");
	   s.add("it");
	   s.add("cast");
	   s.add("heima");
	   Iterator<String> it=s.iterator();
	   while(it.hasNext()){
		   System.out.println(it.next());//遍历的时候也会有无序的表现
	   }
	   for(String a:s){
		   System.out.println(a);
	   }
	   
}
}
