package day18;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/*
 * ����Generic����<>���ŵĶ����涨�˼��ϴ洢�ľ�������
 * ʵ���ϱ�����ɺ��class�ļ�����û�з��͵�
 * ���ǲ��������͵����ݲ��ñ��룬�������ǰ�ȫ�ġ�����˵JAVA������α����
 * ͨ���*
 * 
 */
public class GenericTest {
      public static void main(String[] args) {
	ArrayList<String> array=new ArrayList<String>();
	HashSet<Integer> set=new HashSet<Integer>();
	array.add("123");
	array.add("456");
	set.add(789);
	set.add(890);
	iterator(array);
	iterator(set);
	}
      /*
       * ����һ������ͬʱ������������
       * ���������ܵ���дһ��������
       * ����������ͨ���?����ƥ�����е���������
       */
      public static void iterator(Collection<?> coll){//?ƥ��������������
    	  Iterator<?> it=coll.iterator();
    	  while(it.hasNext()){
    		 System.out.println(it.next());
    	  }
      }
}
