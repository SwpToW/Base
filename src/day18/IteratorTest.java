package day18;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 * 迭代器实现原理  boolean hasNext()方法 判定集合里还有没有元素，如果有，next()方法返回元素，以此来实现遍历集合
 * Iterator接口，找他的实现类
 * 使用Arraylist集合的对象array.iterator()。运行结果就是Iterator接口的实现类的对象
 */
public class IteratorTest {
        public static void main(String[] args) {
		   Collection<String> coll=new ArrayList<String>();
		   coll.add("a");
		   coll.add("b");
		   coll.add("c");
		   Iterator<String> i=coll.iterator();
		   while(i.hasNext()==true){
			   System.out.println(i.next());
		   }
		   
		}
}
