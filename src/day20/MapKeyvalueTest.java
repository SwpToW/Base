package day20;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;



/*
 * Map�ı���
 * Set<E> keySet() ��map�����������е�key��ŵ�һ��Set�������棬ע��Set�����ǿ���ʵ�ֱ�����
 * 1.���ü���ȡֵ
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
