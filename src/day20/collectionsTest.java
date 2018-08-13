package day20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * 集合操作的工具类collections 
 * 区别于接口collection
 * collections.sort 静态方法
 * 对于LIST集合，进行升序排序
 * int collections.binarySearch(List<T>,T a)静态方法
 * 对List集合进行二分搜索
 * shuffle() ,随机
 */
public class collectionsTest {
	public static void main(String[] args) {
		function1();
	}
	public static void function1(){
		List<Integer> list=new ArrayList<Integer>();
		list.add(1);
		list.add(3);
		list.add(4);
		System.out.println(Collections.binarySearch(list, 3));
	}
     public static void function(){
    	 List<String> list=new ArrayList<String>();
    	 list.add("b");
    	 list.add("a");
    	 list.add("c");
    	 Collections.sort(list);
    	 System.out.println(list);
    	 
     }
}
