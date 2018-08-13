package day20;

import java.util.HashMap;

/*
 * 使用Hashmap集合，存储自定义对象
 * 自定义对象做键或值都可以
 * person做键就必须保证键的唯一性，这时候要重写Person的hashCode()和equals方法 
 */
public class HashMapTest {
   public static void main(String[] args) {
	HashMap<Integer, Person> map=new HashMap<Integer,Person>();
	map.put(1, new Person(20,"张三"));
	map.put(2, new Person(21,"李四"));
	map.put(3, new Person(23,"小五"));
	for(Integer i:map.keySet()){
		Person value=map.get(i);
		System.out.println(i+"  "+value);
	}
	
}
}
