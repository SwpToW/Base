package day19;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/*
 * �������Ĳ����޸��쳣 ava.util.ConcurrentModificationException
 * ������ʱ��ʹ���˼��Ϸ����޸��˼��ϳ��ȣ����ǲ�����ġ�
 */
public class IteratorExceptionTest {
     public static void main(String[] args) {
		List<String> l=new ArrayList<String>();
		l.add("abc1");
		l.add("abc2");
		l.add("abc3");
		l.add("abc4");
		ListIterator<String> it=l.listIterator();
		while(it.hasNext()){  //�ظ�:������������������Ҫȥ�Լ������ı䳤�ȵĲ���
			String s=it.next();
			if(s.equals("abc1")){
				it.remove();  //�����õ���������ķ������Լ�����һЩ�涨�Ĳ��������������������������й�ϵ��
			}			
		}
		System.out.println(l);
	}
}
