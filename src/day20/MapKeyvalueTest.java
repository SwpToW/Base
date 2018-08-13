package day20;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;



/*
 * Map的遍历
 * Set<E> keySet() 将map集合里面所有的key存放到一个Set集合里面，注意Set集合是可以实现遍历的
 * 1.利用键获取值
 */
public class MapKeyvalueTest {
	public static void main(String[] args) {
		function();
	}
   public static void function(){
	   Map<Integer, String> map=new HashMap<Integer, String>();
	   map.put(1, "a");
	   map.put(2, "b");
	   map.put(3, "c");
	   LinkedHashSet<Integer> LS=new LinkedHashSet<Integer>(map.keySet());
	   System.out.println(LS.getClass());
	    Iterator<Integer> it=LS.iterator();
	    while(it.hasNext()){
	    	System.out.println(map.get(it.next()));
	    }
   }
}
