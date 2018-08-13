
package day20;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 * Entry接口 将键值对的映射关系封装成了对象
 * 步骤：1.调用map集合方法entrySet()将集合中的映射对象存储到Set集合
 * 2.迭代Set集合
 * 3.如果映射对象关系方法getKey,getvalue方法获取键对值
 */
public class MapEntryTest {
   public static void main(String[] args) {
	   Map<Integer, String> map=new HashMap<Integer, String>();
	   map.put(1, "a");
	   map.put(2, "b");
	   map.put(3, "c");
	   Set<Map.Entry<Integer,String>> s=map.entrySet();//为什么要写成这样呢Map.Entry
	   Iterator<Map.Entry<Integer, String>> it=s.iterator();//因为Entry接口是Map接口里面的内部接口，使用方法是外部类名(或外部接口).内部类名或内部接口
	   while(it.hasNext()){
		   Map.Entry<Integer,String> entry=it.next();
		   System.out.println(entry.getKey()+"  "+entry.getValue());
		  // System.out.println(it.next().getKey()+"对应"+it.next().getValue()); 报错，因为next（）方法调用一次指针向后移动一位，如果
		   //每次循环只是运行一次next()方法没有问题，但是像上面那样有两次或者更多就会出现遍历不匹配，甚至丢失关系的情况
	   }
}
}
