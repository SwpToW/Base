
package day20;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 * Entry�ӿ� ����ֵ�Ե�ӳ���ϵ��װ���˶���
 * ���裺1.����map���Ϸ���entrySet()�������е�ӳ�����洢��Set����
 * 2.����Set����
 * 3.���ӳ������ϵ����getKey,getvalue������ȡ����ֵ
 */
public class MapEntryTest {
   public static void main(String[] args) {
	   Map<Integer, String> map=new HashMap<Integer, String>();
	   map.put(1, "a");
	   map.put(2, "b");
	   map.put(3, "c");
	   Set<Map.Entry<Integer,String>> s=map.entrySet();//ΪʲôҪд��������Map.Entry
	   Iterator<Map.Entry<Integer, String>> it=s.iterator();//��ΪEntry�ӿ���Map�ӿ�������ڲ��ӿڣ�ʹ�÷������ⲿ����(���ⲿ�ӿ�).�ڲ��������ڲ��ӿ�
	   while(it.hasNext()){
		   Map.Entry<Integer,String> entry=it.next();
		   System.out.println(entry.getKey()+"  "+entry.getValue());
		  // System.out.println(it.next().getKey()+"��Ӧ"+it.next().getValue()); ������Ϊnext������������һ��ָ������ƶ�һλ�����
		   //ÿ��ѭ��ֻ������һ��next()����û�����⣬�������������������λ��߸���ͻ���ֱ�����ƥ�䣬������ʧ��ϵ�����
	   }
}
}
