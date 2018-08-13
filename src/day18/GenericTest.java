package day18;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/*
 * 泛型Generic就是<>里存放的东西规定了集合存储的具体类型
 * 实际上编译完成后的class文件中是没有泛型的
 * 但是不符合类型的数据不让编译，所以这是安全的。所以说JAVA泛型是伪泛型
 * 通配符*
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
       * 定义一个方法同时迭代两个集合
       * 迭代器不能单独写一个集合名
       * 参数：泛型通配符?可以匹配所有的数据类型
       */
      public static void iterator(Collection<?> coll){//?匹配所有数据类型
    	  Iterator<?> it=coll.iterator();
    	  while(it.hasNext()){
    		 System.out.println(it.next());
    	  }
      }
}
