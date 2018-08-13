package day20;

import java.util.HashMap;
import java.util.Map;

/*Map接口
 * Map<K,V>（映射键值对）存储的元素由键和值两部分组成，这区别于collection
 * key-value   由键可以找到值
 * 常用方法使用map的实现类HashMap
 * V put(K,V) 将键值放进HashMap类的对象   ，返回值一般为null;当存储重复键的时候，会返回被覆盖键之前的值
 * V get(K)  通过键拿到值,如果放进集合中不存在的键，返回null
 * V remove(K) 移除键对应的值，并将其返回,如果不存在这个键，返回null
 */
public class MapTest {
   public static void main(String[] args) {
	function2();
}
   public static void function2(){
	   Map<Integer, String> map=new HashMap<Integer, String>();
	   map.put(1, "a");
	   map.put(2, "b");
	   map.put(3, "c");
	   System.out.println(map.remove(2));
	   System.out.println(map);
   }
   public static void function1(){
	   Map<Integer, String> map=new HashMap<Integer, String>();
	   map.put(1, "a");
	   map.put(2, "b");
	   map.put(3, "c");
	   System.out.println(map.get(2));
   }
   public static void function() {
	// TODO Auto-generated method stub
    Map<String,Integer> map=new HashMap<String,Integer>();
    map.put("a", 1);
    map.put("b", 2);
    map.put("c", 3);
    //map.put("c", 1);  不允许存储重复键，当有重复键出现的时候，会对之前的重复键对应的值覆盖
    System.out.println(map); 
}
}
