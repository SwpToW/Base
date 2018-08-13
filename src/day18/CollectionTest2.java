package day18;

import java.util.ArrayList;
import java.util.Collection;

/*
 * boolean Remove(Objects o)方法
 */
public class CollectionTest2 {
      public static void main(String[] args) {
		Collection<String> coll =new ArrayList<String>();
		coll.add("abc");
		coll.add("abc");
		System.out.println(coll.remove("abc")); //删除第一个匹配的元素，删除成功返回ture
		System.out.println(coll);
	}
}
