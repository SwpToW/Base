package day18;

import java.util.ArrayList;
import java.util.Collection;

/*
 * collection�ӿ��еķ���
 * �Ǽ���������ʵ�������ӵ�еķ���
 * ʹ��collection�ӿڵ�ʵ����
 * ARRAYLIST implements list
 * list extends collection �ӿڼ̳нӿ�
 * ������ִ�У�����ʵ�������д
 * 
 */
public class CollectionTest {
   /*
    * collection�ӿڵķ���
    * void clear()��ռ����е�����Ԫ��
    * boolean contains(Objects o)�ж������Ƿ�����ڼ����У����ڷ���true
    * Objects[] toArray()�����������е�Ԫ�ر��һ������
    */
	public static void main(String[] args) {
		function();
	}
	public static void function(){ 
		Collection<String> coll=new ArrayList<String>();//�ӿڵĶ�̬
		coll.add("abc");
		coll.add("abc");
		System.out.println(coll.toString());
		//coll.clear();       void clear()��ռ����е�����Ԫ��,�������ټ���
		System.out.println(coll.toString());
		//String s="abc";
		System.out.println(coll.contains("abc"));
		Object[] str=coll.toArray();
	}
}
