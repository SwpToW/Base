package day18;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 * ������ʵ��ԭ��  boolean hasNext()���� �ж������ﻹ��û��Ԫ�أ�����У�next()��������Ԫ�أ��Դ���ʵ�ֱ�������
 * Iterator�ӿڣ�������ʵ����
 * ʹ��Arraylist���ϵĶ���array.iterator()�����н������Iterator�ӿڵ�ʵ����Ķ���
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
