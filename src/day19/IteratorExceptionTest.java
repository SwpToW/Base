package day19;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/*
 * 迭代器的并发修改异常 ava.util.ConcurrentModificationException
 * 遍历的时候，使用了集合方法修改了集合长度，这是不允许的。
 */
public class IteratorExceptionTest {
     public static void main(String[] args) {
		List<String> l=new ArrayList<String>();
		l.add("abc1");
		l.add("abc2");
		l.add("abc3");
		l.add("abc4");
		ListIterator<String> it=l.listIterator();
		while(it.hasNext()){  //重复:迭代器用来遍历，不要去对集合做改变长度的操作
			String s=it.next();
			if(s.equals("abc1")){
				it.remove();  //可以用迭代器本身的方法来对集合做一些规定的操作（操作方法跟迭代器本身有关系）
			}			
		}
		System.out.println(l);
	}
}
