package day20;

import java.util.HashMap;

/*
 * ʹ��Hashmap���ϣ��洢�Զ������
 * �Զ������������ֵ������
 * person�����ͱ��뱣֤����Ψһ�ԣ���ʱ��Ҫ��дPerson��hashCode()��equals���� 
 */
public class HashMapTest {
   public static void main(String[] args) {
	HashMap<Integer, Person> map=new HashMap<Integer,Person>();
	map.put(1, new Person(20,"����"));
	map.put(2, new Person(21,"����"));
	map.put(3, new Person(23,"С��"));
	for(Integer i:map.keySet()){
		Person value=map.get(i);
		System.out.println(i+"  "+value);
	}
	
}
}
