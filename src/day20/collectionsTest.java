package day20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * ���ϲ����Ĺ�����collections 
 * �����ڽӿ�collection
 * collections.sort ��̬����
 * ����LIST���ϣ�������������
 * int collections.binarySearch(List<T>,T a)��̬����
 * ��List���Ͻ��ж�������
 * shuffle() ,���
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
