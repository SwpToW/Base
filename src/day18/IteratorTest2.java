package day18;

import java.util.ArrayList;
import java.util.Collection;

/*
 * 集合可以存储任意类型的对象
 */
public class IteratorTest2 {
       public static void main(String[] args) {
		//集合中也可以不指定数据类型， 这样 存进集合里的都是Object对象，这样比较麻烦(后面需要有Object类型向下的转型才可以调用子类对象的特有方法)。
    	   //所以在使用集合的时候应该规定范型
    	   Collection coll=new ArrayList();
    	   coll.add("");
	}
}
