package day18;

import java.util.ArrayList;
import java.util.Collection;

/*
 * boolean Remove(Objects o)����
 */
public class CollectionTest2 {
      public static void main(String[] args) {
		Collection<String> coll =new ArrayList<String>();
		coll.add("abc");
		coll.add("abc");
		System.out.println(coll.remove("abc")); //ɾ����һ��ƥ���Ԫ�أ�ɾ���ɹ�����ture
		System.out.println(coll);
	}
}
