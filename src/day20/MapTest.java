package day20;

import java.util.HashMap;
import java.util.Map;

/*Map�ӿ�
 * Map<K,V>��ӳ���ֵ�ԣ��洢��Ԫ���ɼ���ֵ��������ɣ���������collection
 * key-value   �ɼ������ҵ�ֵ
 * ���÷���ʹ��map��ʵ����HashMap
 * V put(K,V) ����ֵ�Ž�HashMap��Ķ���   ������ֵһ��Ϊnull;���洢�ظ�����ʱ�򣬻᷵�ر����Ǽ�֮ǰ��ֵ
 * V get(K)  ͨ�����õ�ֵ,����Ž������в����ڵļ�������null
 * V remove(K) �Ƴ�����Ӧ��ֵ�������䷵��,��������������������null
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
    //map.put("c", 1);  ������洢�ظ����������ظ������ֵ�ʱ�򣬻��֮ǰ���ظ�����Ӧ��ֵ����
    System.out.println(map); 
}
}
