package day18;

import java.util.ArrayList;
import java.util.Collection;

/*
 * collection接口中的方法
 * 是集合中所有实现类必须拥有的方法
 * 使用collection接口的实现类
 * ARRAYLIST implements list
 * list extends collection 接口继承接口
 * 方法的执行，都是实现类的重写
 * 
 */
public class CollectionTest {
   /*
    * collection接口的方法
    * void clear()清空集合中的所有元素
    * boolean contains(Objects o)判定对象是否存在于集合中，存在返回true
    * Objects[] toArray()方法将集合中的元素变成一个数组
    */
	public static void main(String[] args) {
		function();
	}
	public static void function(){ 
		Collection<String> coll=new ArrayList<String>();//接口的多态
		coll.add("abc");
		coll.add("abc");
		System.out.println(coll.toString());
		//coll.clear();       void clear()清空集合中的所有元素,不是销毁集合
		System.out.println(coll.toString());
		//String s="abc";
		System.out.println(coll.contains("abc"));
		Object[] str=coll.toArray();
	}
}
